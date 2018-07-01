package matrixexp.mexp;


import matrixexp.mexp.matrix.Result;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.Collections;
import java.util.List;

/**
 * Created by xianfengzhang on 2017/9/4.
 */
public class MatrixErrListener extends BaseErrorListener {
    Result<StringBuilder> result;

    public MatrixErrListener() {
        super();
        result = new Result<>(true);
        result.setData(new StringBuilder());
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        result.setSuccess(false);
        result.setMsg(e.getMessage());
        List<String> stack = ((Parser) recognizer).getRuleInvocationStack();
        Collections.reverse(stack);
        result.getData().append(e.getMessage());
        result.getData().append("rule stack: " + stack);
        result.getData().append("line " + line + ":" + charPositionInLine + " at " +
                offendingSymbol + ": " + msg);
    }

}
