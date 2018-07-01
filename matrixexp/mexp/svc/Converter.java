package matrixexp.mexp.svc;


import matrixexp.mexp.matrix.Matrix;
import matrixexp.mexp.matrix.Result;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/**
 * Created by xianfengzhang on 2017/8/28.
 */
public final class Converter {
    private Converter() {
    }
    public static String getStackTrace(final Throwable throwable) {
        final StringWriter sw = new StringWriter();
        final PrintWriter pw = new PrintWriter(sw, true);
        throwable.printStackTrace(pw);
        return sw.getBuffer().toString();
    }
}
