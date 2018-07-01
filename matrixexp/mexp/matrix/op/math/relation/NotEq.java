package matrixexp.mexp.matrix.op.math.relation;

/**
 * Created by xianfengzhang on 2017/8/24.
 */
public class NotEq extends BaseMathRelation {
    @Override
    public String getName() {
        return "!=";
    }

    @Override
    public Float doOp(Float left, Float right) {
        if (Math.abs(left - right) >= FLOAT_DELTA) {
            return TRUE;
        }
        return FALSE;
    }
}
