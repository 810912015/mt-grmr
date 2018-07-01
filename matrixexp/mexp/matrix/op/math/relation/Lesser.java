package matrixexp.mexp.matrix.op.math.relation;

/**
 * Created by xianfengzhang on 2017/8/24.
 */
public class Lesser extends BaseMathRelation {
    @Override
    public String getName() {
        return "<";
    }

    @Override
    public Float doOp(Float left, Float right) {
        if (left < right) {
            return TRUE;
        } else {
            return FALSE;
        }
    }
}
