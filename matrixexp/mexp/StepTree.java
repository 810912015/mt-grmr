package matrixexp.mexp;


import matrixexp.mexp.matrix.Step;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xianfengzhang
 * @date 2018/3/29
 */
public class StepTree extends ParseTreeProperty<Step> {
    public String toReadable() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Map.Entry<ParseTree, Step> e : annotations.entrySet()) {
            sb.append("\n");
            sb.append(i);
            sb.append("--");
            sb.append(e.getKey().getText());
            sb.append("\n");
            sb.append(i);
            sb.append("--");
            sb.append(e.getValue().toString());
            i++;
        }
        return sb.toString();
    }

    public Map<String, Step> getRelationLeftValues() {
        Map<String, Step> r = new HashMap<>();
        for (Map.Entry<ParseTree, Step> e : annotations.entrySet()) {
            if (e.getValue().isRelationLeftValue()) {
                r.put(e.getKey().getText(), e.getValue());
            }
        }
        return r;
    }
}