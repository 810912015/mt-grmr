package matrixexp.mexp;


import matrixexp.mexp.matrix.Result;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * @author xianfengzhang
 * @date 2018/3/29
 */
public interface ParseTreeProvider {
    Result<ParseTree> getByExp(String exp);
}
