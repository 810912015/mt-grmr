package matrixexp.mexp.matrix;




import matrixexp.mexp.CalcCtx;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xianfengzhang on 2017/8/24.
 */
public class Matrices {
    private Map<Integer, Matrix> items;
    private String exp;
    private CalcCtx ctx;

    public Matrices(List<Matrix> mlist, String exp) {
        ctx = new CalcCtx();
        this.exp = exp;
        this.items = new HashMap<>();
        for (int i = 0; i < mlist.size(); i++) {
            items.put(i, mlist.get(i));
        }
    }

    public Matrix get(String s) {
        char c = s.charAt(0);
        if (c < 'A' || c > 'Z') {
            return null;
        }
        int k = c - 'A';
        if (k >= items.size()) {
            return null;
        }
        return items.get(k);
    }

    public Collection<Matrix> getItems() {
        return items.values();
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Matrices{");
        sb.append("exp='" + exp + '\'');
        sb.append("items=[");
        int i = 0;
        for (Matrix m : items.values()) {
            sb.append(m.toString());
            i += 1;
            if (i < items.size()) {
                sb.append(",");
            }
        }
        sb.append("]}");
        return sb.toString();
    }

    public CalcCtx getCtx() {
        return ctx;
    }

    public void setCtx(CalcCtx ctx) {
        this.ctx = ctx;
    }
}
