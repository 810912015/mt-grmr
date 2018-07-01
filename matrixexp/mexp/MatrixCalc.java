package matrixexp.mexp;


import matrixexp.mexp.matrix.Matrices;
import matrixexp.mexp.matrix.Result;
import matrixexp.mexp.matrix.Step;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * Created by xianfengzhang on 2017/8/25.
 */
public class MatrixCalc {

    static final ParseTreeProvider PARSE_TREE_PROVIDER = new MapParseTreeProvider();

    void save(Matrices ms) {

    }

    public Result<Step> calc(Matrices ms) {
        Result<ParseTree> t = PARSE_TREE_PROVIDER.getByExp(ms.getExp());
        ms.getCtx().add("语法检查:" + t);
        if (!t.isSuccess()) {
            return new Result<>(t.isSuccess(), t.getMsg(), null);
        }
        ParseTree tree = t.getData();
        ParseTreeWalker walker = new ParseTreeWalker();
        CalcListener cl = new CalcListener(ms);
        walker.walk(cl, tree);
        try {
            Step r = cl.getValue(tree);
            ms.getCtx().add("中间结果:" + cl.getSteps());
            ms.getCtx().setRelationLeftValues(cl.getValueTree().getRelationLeftValues());
            ms.getCtx().setResult(r);
            save(ms);
            return new Result<>(true, "", r);
        } catch (RuntimeException e) {
            return new Result<>(false, e.getMessage(), null);
        }
    }

    public Result<ParseTree> validate(String exp) {
        return PARSE_TREE_PROVIDER.getByExp(exp);
    }
}
