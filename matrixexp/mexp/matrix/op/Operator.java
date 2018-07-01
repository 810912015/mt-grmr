package matrixexp.mexp.matrix.op;


import matrixexp.mexp.matrix.Matrix;
import matrixexp.mexp.matrix.Result;

/**
 * Created by xianfengzhang on 2017/8/24.
 */
public interface Operator {
    String getName();

    Result<Matrix> op(Matrix left, String[] leftCol, Matrix right, String[] rightCol);

    Result<Matrix> op(Matrix left, String[] leftCol, Float right);

    Result<Matrix> op(Float left, Matrix right, String[] rightCol);

    Result<Float> op(Float left, Float right);
}
