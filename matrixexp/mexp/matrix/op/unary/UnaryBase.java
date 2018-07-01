package matrixexp.mexp.matrix.op.unary;



import matrixexp.mexp.matrix.ArrayMatrix;
import matrixexp.mexp.matrix.Matrix;
import matrixexp.mexp.matrix.Step;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author xianfengzhang
 * @date 2018/3/29
 */
public interface UnaryBase {
    static String[] toArray(List<String> s) {
        String[] r = new String[s.size()];
        s.toArray(r);
        return r;
    }

    default Step calc(Step source) {
        if (source == null) {
            return null;
        }
        if (source.getValue() != null) {
            return new Step(calcFloat(source.getValue()));
        }
        if (source.getMatrix() == null) {
            return null;
        }

        Matrix m = source.getMatrix();
        Map<String, Map<String, String>> tv = m.getValues(source.getCols());
        List<List<String>> r = new ArrayList<>();
        List<String> rc = new ArrayList<>();
        for (String s : m.getRowKeys()) {
            rc.add(s);
        }
        for (String s : source.getCols()) {
            rc.add(s);
        }
        r.add(rc);
        for (Map.Entry<String, Map<String, String>> e : tv.entrySet()) {
            List<String> tr = new ArrayList<>();
            tr.add(e.getKey());
            for (Map.Entry<String, String> de : e.getValue().entrySet()) {
                String s = de.getValue();
                Float f = Float.valueOf(s);
                Float fr = calcFloat(f);
                tr.add(Float.toString(fr));
            }
            r.add(tr);
        }
        String[][] sr = new String[r.size()][r.get(0).size()];
        for (int i = 0; i < r.size(); i++) {
            sr[i] = toArray(r.get(i));
        }

        Matrix mr = new ArrayMatrix("", sr, m.getKeyString());
        return new Step(mr, source.getCols());

    }

    Float calcFloat(Float source);
}
