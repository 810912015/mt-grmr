package matrixexp.mexp.matrix.op.math;

/**
 * Created by xianfengzhang on 2017/8/24.
 */
public class Adder extends BaseMath {
    @Override
    public String getName() {
        return "+";
    }

    @Override
    public Float doOp(Float left, Float right) {
        return left + right;
    }

    @Override
    public boolean isBool() {
        return false;
    }
}
