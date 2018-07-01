package matrixexp.mexp.matrix.op.math;


/**
 * Created by xianfengzhang on 2017/8/25.
 */
public class Power extends BaseMath {
    @Override
    public String getName() {
        return "^";
    }

    @Override
    public Float doOp(Float left, Float right) {
        double d = Math.pow(left, right);
        return new Float(d);
    }
}
