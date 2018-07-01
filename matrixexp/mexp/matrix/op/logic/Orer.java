package matrixexp.mexp.matrix.op.logic;

import java.util.Collection;

/**
 * Created by xianfengzhang on 2017/8/25.
 */
public class Orer extends BaseLogic {
    @Override
    public String getName() {
        return "||";
    }

    @Override
    public Float doOp(Float left, Float right) {
        if (left == 1 || right == 1) {
            return TRUE;
        }
        return FALSE;
    }

    @Override
    public String operateMulti(Collection<String> left, Collection<String> right) {
        for (String s : left) {
            if (isTrue(s)) {
                return TRUE_STR;
            }
        }
        if (right != null) {
            for (String s : right) {
                if (isTrue(s)) {
                    return TRUE_STR;
                }
            }
        }
        return FALSE_STR;
    }
}
