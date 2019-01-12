package com.pivot.json;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

public class AntlrJsonBuilder implements JsonBuilder {
    private String json;
    private Map<String, Object> model;
    private SrcMaker maker;

    private AntlrJsonBuilder(String s) {
        this.json = s;
        maker = new SrcMaker();
    }

    public static AntlrJsonBuilder build(String json) {
        return new AntlrJsonBuilder(json);
    }

    @Override
    public String toSrc(String className) {
        try {
            return maker.toSrc(model, className);
        }catch (Exception e){
            throw new RuntimeException("illegal formated json",e);
        }
    }

    public static class SrcMaker {
        public String toSrc(Map<String, Object> r, String className) {
            StringBuilder sb = new StringBuilder();
            toClass(r, sb, className);
            return sb.toString();
        }

        private int level = 0;

        public void toClass(Map<String, Object> map, StringBuilder outer, String className) {
            StringBuilder sb = new StringBuilder();
            boolean level1 = level++ == 0;
            StringBuilder csb = level1 ? outer : sb;
            if (level1) {
                csb.append("public class ");
            } else {
                csb.append("public static class ");
            }
            csb.append(className);
            csb.append("{");
            csb.append(System.lineSeparator());
            for (String k : map.keySet()) {
                makeOne(map, outer, sb, k);
            }
            sb.append("}");
            sb.append(System.lineSeparator());
            outer.append(sb.toString());
        }

        String makeClassName(String k) {
            return k.substring(0, 1).toUpperCase() + k.substring(1);
        }

        private void makeOne(Map<String, Object> map, StringBuilder outer, StringBuilder sb, String k) {
            Object o = map.get(k);
            String cn = makeClassName(k);
            if (o instanceof String) {
                sb.append("private String " + k + ";");
                sb.append(System.lineSeparator());
                makeGetProperty(sb, "String", k);
                makeSetProperty(sb, "String", k);
            } else if (o instanceof Map<?, ?>) {
                deep(outer, sb, k, cn, (Map<String, Object>) o, "", "");
            } else {
                List<Object> l = (List<Object>) map.get(k);
                Object o1 = l.get(0);
                if (o1 instanceof Map<?, ?>) {
                    deep(outer, sb, k, cn, (Map<String, Object>) o1, "List<", ">");
                }
            }
        }

        private void deep(StringBuilder outer, StringBuilder sb, String k,
                          String cn, Map<String, Object> o2, String startField, String endField) {
            toClass(o2, outer, cn);
            String fcn = String.format("%s%s%s", startField, cn, endField);
            sb.append(String.format("private %s %s;", fcn, k));
            sb.append(System.lineSeparator());
            makeGetProperty(sb, fcn, k);
            makeSetProperty(sb, fcn, k);
        }

        void makeGetProperty(StringBuilder sb, String cn, String field) {
            sb.append(String.format("public %s get%s(){", cn, makeClassName(field)));
            sb.append(System.lineSeparator());
            sb.append(String.format("return this.%s;", field));
            sb.append(System.lineSeparator());
            sb.append("}");
            sb.append(System.lineSeparator());
        }

        void makeSetProperty(StringBuilder sb, String cn, String field) {
            sb.append(String.format("public void Set%s(%s %s){", makeClassName(field), cn, field));
            sb.append(System.lineSeparator());
            sb.append(String.format("this.%s=%s;", field, field));
            sb.append(System.lineSeparator());
            sb.append("}");
            sb.append(System.lineSeparator());
        }
    }

    @Override
    public String get(String path) {
        try {
            if (this.model == null) {
                this.model = parse();
            }
            String[] sa = path.split("\\.");
            Map<String, Object> m = this.model;
            for (int i = 0; i < sa.length; i++) {
                String k = sa[i];
                String ks = k;
                int ind = -1;
                boolean isArray = k.contains("[");
                boolean last = i == sa.length - 1;
                if (isArray) {
                    String index = k.substring(k.indexOf("[") + 1, k.indexOf("]"));
                    ind = Integer.valueOf(index);
                    ks = k.substring(0, k.indexOf("["));
                }
                Object o = m.get(ks);
                if (o == null) {
                    return null;
                }
                if (!isArray) {
                    if (last) {
                        return (String) o;
                    } else {
                        m = (Map<String, Object>) o;
                    }
                } else {
                    List<Object> l = (List<Object>) o;
                    if (last) {
                        return (String) (l.get(ind));
                    } else {
                        m = (Map<String, Object>) (l.get(ind));
                    }
                }
            }
            return null;
        } catch (Exception e) {
            throw new RuntimeException("illegal formated json",e);
        }
    }

    public Map<String, Object> parse() {
        try {
            ParseTree pt = makeByExp(this.json);
            ParseTreeWalker walker = new ParseTreeWalker();
            BuilderListener listener = new BuilderListener();
            walker.walk(listener, pt);
            Map<String, Object> r = listener.getResult(pt);
            return r;
        } catch (Exception e) {
            throw new RuntimeException("illegal formated json",e);
        }
    }

    public ParseTree makeByExp(String exp) {
        InputStream stream = new ByteArrayInputStream(exp.getBytes(StandardCharsets.UTF_8));
        CharStream cs = null;
        try {
            cs = CharStreams.fromStream(stream);
        } catch (IOException e) {
            return null;
        }
        JSONLexer lexer = new JSONLexer(cs);
        CommonTokenStream ctx = new CommonTokenStream(lexer);
        JSONParser parser = new JSONParser(ctx);
        parser.setBuildParseTree(true);
        ParseTree pt = parser.json();
        return pt;
    }
}
