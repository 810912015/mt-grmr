package matrixexp.mexp.matrix.op;



import matrixexp.mexp.matrix.ArrayMatrix;
import matrixexp.mexp.matrix.Func;
import matrixexp.mexp.matrix.Matrix;
import matrixexp.mexp.matrix.Result;
import matrixexp.mexp.matrix.op.logic.BaseLogic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.Collections.addAll;

/**
 * Created by xianfengzhang on 2017/8/24.
 */
public abstract class BaseOperator implements Operator {
    public static final float FLOAT_DELTA = 0.0000001F;
    public static final float TRUE = 1F;
    public static final float FALSE = 0F;

    public Result isValid(Matrix m, String[] col) {
        if (m == null || col == null || col.length == 0) {
            return new Result("矩阵和列名均不能为空");
        }
        if (!m.getCols().contains(BaseLogic.BOOL_VALUE_COL_NAME)) {
            for (String s : col) {
                if (!m.hasCol(s)) {
                    return new Result("不包含列:" + s);
                }
            }
        }
        return new Result(true);
    }

    @Override
    public Result<Float> op(Float left, Float right) {
        Result<Float> r = new Result<>(true);
        r.setData(doOp(left, right));
        return r;
    }

    @Override
    public Result<Matrix> op(Matrix left, String[] leftCol, Float right) {
        return opFloatMatrix(right, left, leftCol, (s, aFloat) -> opString(s, Float.toString(aFloat)));
    }

    @Override
    public Result<Matrix> op(final Float left, Matrix right, String[] rightCol) {
        return opFloatMatrix(left, right, rightCol, (s, f) -> opString(Float.toString(f), s));
    }

    public Result<Matrix> opFloatMatrix(Float value, Matrix matrix, String[] cols, Func<String, Float, String> f) {
        Result rc = isValid(matrix, cols);
        if (!rc.isSuccess()) {
            return rc;
        }
        Map<String, Map<String, String>> rv = matrix.getValues(cols);
        List<String[]> r = new ArrayList<>();
        String[] kd = makeCols(cols, matrix.getKeyString());
        r.add(kd);
        for (Map.Entry<String, Map<String, String>> e : rv.entrySet()) {
            List<String> t = new ArrayList<>();
            t.add(e.getKey());
            Map<String, String> tv = e.getValue();
            for (Map.Entry<String, String> s : tv.entrySet()) {
                String lvt = s.getValue();
                String vv = f.cal(lvt, value);
                t.add(vv);
            }
            r.add(toArray(t));
        }
        return getResult(r, matrix.getKeyString());
    }

    public Result<Matrix> getResult(List<String[]> r, String ks) {
        String[][] rr = new String[r.size()][];
        r.toArray(rr);

        Matrix am = new ArrayMatrix("", rr, ks);

        am.setIsBool(isBool());

        return new Result<>(true, "", am);
    }

    public boolean isBool() {
        return true;
    }

    public String[] makeCols(String[] col, String ks) {
        List<String> k = new ArrayList<>();
        addAll(k, ks);
        addAll(k, col);
        return toArray(k);
    }

    public String[] toArray(List<String> s) {
        String[] r = new String[s.size()];
        s.toArray(r);
        return r;
    }

    public String opString(String l, String r) {
        Float lf = parse(l);
        Float rf = parse(r);
        if (lf == null || rf == null) {
            return null;
        }
        Float rr = doOp(lf, rf);
        return Float.toString(rr);
    }

    public abstract Float doOp(Float left, Float right);

    public Float parse(String s) {
        try {
            if (s == null || s.isEmpty()) {
                return null;
            }
            return Float.valueOf(s);
        } catch (RuntimeException e) {
            return null;
        }
    }
}
