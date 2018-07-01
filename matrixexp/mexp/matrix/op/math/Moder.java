package matrixexp.mexp.matrix.op.math;

/**
 * Created by xianfengzhang on 2017/8/25.
 */
public class Moder extends BaseMath {
    @Override
    public String getName() {
        return "%";
    }

    @Override
    public Float doOp(Float left, Float right) {
        int l = left.intValue();
        int r = right.intValue();
        if (r == 0) {
            return 0F;
        }
        return (float) (l % r);
    }
}
