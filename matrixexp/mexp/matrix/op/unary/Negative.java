package matrixexp.mexp.matrix.op.unary;

/**
 * @author xianfengzhang
 * @date 2018/3/29
 */
public class Negative implements UnaryBase {
    @Override
    public Float calcFloat(Float source) {
        return source * (-1);
    }
}
