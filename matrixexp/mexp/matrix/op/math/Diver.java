package matrixexp.mexp.matrix.op.math;

/**
 * Created by xianfengzhang on 2017/8/24.
 */
public class Diver extends BaseMath {
    @Override
    public String getName() {
        return "/";
    }

    @Override
    public Float doOp(Float left, Float right) {
        if (right == 0) {
            return 0F;
        }
        return left / right;
    }

    @Override
    public boolean isBool() {
        return false;
    }
}
