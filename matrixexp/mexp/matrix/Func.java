package matrixexp.mexp.matrix;


/**
 * Created by xianfengzhang on 2017/8/24.
 */
public interface Func<T1, T2, R> {
    R cal(T1 t1, T2 t2);
}
