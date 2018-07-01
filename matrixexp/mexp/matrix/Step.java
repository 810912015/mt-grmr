package matrixexp.mexp.matrix;



import matrixexp.mexp.matrix.op.logic.BaseLogic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by xianfengzhang on 2017/8/24.
 */

public class Step {
    private Matrix matrix;
    private Float value;
    private List<String> cols;
    private boolean relationLeftValue;

    public Step(Matrix m) {
        this.matrix = m;
        this.cols = new ArrayList<>();
        relationLeftValue = false;
    }

    public Step(Matrix m, String[] cols) {
        this.matrix = m;
        relationLeftValue = false;
        if (m.getContent()[0][1].equals(BaseLogic.BOOL_VALUE_COL_NAME)) {
            this.cols = Arrays.asList(BaseLogic.BOOL_VALUE_COL_NAME);
        } else {
            this.cols = Arrays.asList(cols);
        }
    }

    public Step(Float f) {
        this.value = f;
        relationLeftValue = false;
    }

    public void addCol(String col) {
        if (cols == null) {
            return;
        }
        this.cols.add(col);
    }

    public String[] getCols() {
        String[] cs = new String[cols.size()];
        cols.toArray(cs);
        return cs;
    }

    public Matrix getMatrix() {
        return matrix;
    }

    public void setMatrix(Matrix matrix) {
        this.matrix = matrix;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Step{" +
                "matrix=" + matrix +
                ", value=" + value +
                '}';
    }

    public boolean isRelationLeftValue() {
        return relationLeftValue;
    }

    public void setRelationLeftValue(boolean relationLeftValue) {
        this.relationLeftValue = relationLeftValue;
    }
}
