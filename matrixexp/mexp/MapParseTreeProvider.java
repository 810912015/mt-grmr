package matrixexp.mexp;

import matrixexp.mexp.matrix.Result;
import matrixexp.parser.MatrixExpLexer;
import matrixexp.parser.MatrixExpParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.lang3.StringUtils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xianfengzhang
 * @date 2018/3/29
 */
public class MapParseTreeProvider implements ParseTreeProvider {
    Map<String, Result<ParseTree>> parseTreeMap;

    public MapParseTreeProvider() {
        parseTreeMap = new HashMap<>();
    }

    @Override
    public Result<ParseTree> getByExp(String exp) {
        if (StringUtils.isEmpty(exp)) {
            return new Result<>(false, "要计算的表达式不能为空", null);
        }
        if (parseTreeMap.containsKey(exp)) {
            return parseTreeMap.get(exp);
        }
        synchronized (parseTreeMap) {
            if (parseTreeMap.containsKey(exp)) {
                return parseTreeMap.get(exp);
            }
            Result<ParseTree> pt = makeByExp(exp);
            parseTreeMap.put(exp, pt);
            return pt;
        }
    }

    public Result<ParseTree> makeByExp(String exp) {
        InputStream stream = new ByteArrayInputStream(exp.getBytes(StandardCharsets.UTF_8));
        CharStream cs = null;
        try {
            cs = CharStreams.fromStream(stream);
        } catch (IOException e) {

            return new Result<>(false, e.getMessage(), null);
        }
        MatrixExpLexer lexer = new MatrixExpLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MatrixErrListener mel = new MatrixErrListener();
        MatrixExpParser parser = new MatrixExpParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(mel);
        parser.setBuildParseTree(true);
        Result<ParseTree> pr = new Result<>();
        ParseTree pt = parser.exp();
        pr.setData(pt);
        String pd = pt.getText();
        boolean ie = exp.replaceAll("\\s+", "").equalsIgnoreCase(pd);
        if (!ie) {
            pr.setSuccess(false);
            pr.setMsg("不能全部解析");
            return pr;
        }
        if (!mel.result.isSuccess()) {
            pr.setSuccess(false);
            pr.setMsg(mel.result.toString());
            return pr;
        }
        pr.setMsg("解析成功,请确保矩阵中包含要计算的列");
        pr.setSuccess(true);
        return pr;
    }
}
