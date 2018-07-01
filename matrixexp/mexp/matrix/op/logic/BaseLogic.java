package matrixexp.mexp.matrix.op.logic;



import matrixexp.mexp.matrix.Matrix;
import matrixexp.mexp.matrix.Result;
import matrixexp.mexp.matrix.op.BaseOperator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created by xianfengzhang on 2017/9/5.
 */
public abstract class BaseLogic extends BaseOperator {
    public static final String BOOL_VALUE_COL_NAME = "boolValue";
    public static final String TRUE_STR = "1.0";
    public static final String FALSE_STR = "0.0";

    @Override
    public Result<Matrix> op(Matrix left, String[] leftCol, Matrix right, String[] rightCol) {
        Result lc = isValid(left, leftCol);
        if (!lc.isSuccess()) {
            return lc;
        }
        Result rc = isValid(right, rightCol);
        if (!rc.isSuccess()) {
            return rc;
        }

        Map<String, Map<String, String>> lv = left.getValues(leftCol);
        Map<String, Map<String, String>> rv = right.getValues(rightCol);
        List<String[]> r = new ArrayList<>();
        List<String> ca = new ArrayList<>();
        ca.add(left.getKeyString());
        ca.add(BOOL_VALUE_COL_NAME);
        r.add(toArray(ca));
        for (Map.Entry<String, Map<String, String>> e : lv.entrySet()) {
            List<String> t = new ArrayList<>();
            t.add(e.getKey());
            Collection<String> tlv = e.getValue().values();
            Collection<String> trv = rv.get(e.getKey()).values();
            t.add(operateMulti(tlv, trv));
            r.add(toArray(t));
        }
        return getResult(r, ca.get(0));
    }

    public boolean isTrue(String s) {
        if (s == null) {
            return false;
        }
        return "1.0".equals(s);
    }

    public boolean isFalse(String s) {
        if (s == null) {
            return true;
        }
        return "0.0".equals(s);
    }

    public abstract String operateMulti(Collection<String> left, Collection<String> right);
}
