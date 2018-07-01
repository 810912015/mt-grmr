package matrixexp.mexp.matrix.op.math;



import matrixexp.mexp.matrix.Matrix;
import matrixexp.mexp.matrix.Result;
import matrixexp.mexp.matrix.op.BaseOperator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xianfengzhang on 2017/9/5.
 */
public abstract class BaseMath extends BaseOperator {
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

        Map<String, String> keyMap = makeKeyMap(leftCol, rightCol);
        Map<String, Map<String, String>> lv = left.getValues(leftCol);
        Map<String, Map<String, String>> rv = right.getValues(rightCol);
        List<String[]> r = new ArrayList<>();
        String[] kd = makeCols(leftCol, left.getKeyString());
        r.add(kd);
        for (Map.Entry<String, Map<String, String>> e : lv.entrySet()) {
            List<String> t = new ArrayList<>();
            t.add(e.getKey());
            Map<String, String> tv = e.getValue();
            for (String s : tv.keySet()) {
                cal(keyMap, rv, e, t, tv, s);
            }
            r.add(toArray(t));
        }
        return getResult(r, left.getKeyString());
    }

    void cal(Map<String, String> keyMap,
             Map<String, Map<String, String>> rv,
             Map.Entry<String, Map<String, String>> e,
             List<String> t,
             Map<String, String> tv,
             String s) {
        String lvt = tv.get(s);
        Map<String, String> rm = rv.get(e.getKey());
        if (rm == null) {
            t.add(null);
            return;
        }
        String rvt = rm.get(keyMap.get(s));
        if (rvt == null) {
            t.add(null);
            return;
        }
        String ar = opString(lvt, rvt);
        t.add(ar);
    }

    public Map<String, String> makeKeyMap(String[] leftCol, String[] rightCol) {
        Map<String, String> keyMap = new HashMap<>();
        int mc = leftCol.length > rightCol.length ? leftCol.length : rightCol.length;

        for (int i = 0; i < mc; i++) {
            if (i >= rightCol.length) {
                keyMap.put(leftCol[i], rightCol[0]);
            } else if (i >= leftCol.length) {
                keyMap.put(leftCol[0], rightCol[i]);
            } else {
                keyMap.put(leftCol[i], rightCol[i]);
            }
        }
        return keyMap;
    }
}
