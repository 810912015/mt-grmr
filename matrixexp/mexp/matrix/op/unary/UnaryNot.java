package matrixexp.mexp.matrix.op.unary;

/**
 * @author xianfengzhang
 * @date 2018/3/29
 */
public class UnaryNot implements UnaryBase {
    @Override
    public Float calcFloat(Float source) {
        if (source > 0) {
            return 0F;
        }
        return 1F;
    }
}
