package matrixexp.mexp.matrix.op.logic;

import java.util.Collection;

/**
 * Created by xianfengzhang on 2017/8/25.
 */
public class Ander extends BaseLogic {

    @Override
    public String getName() {
        return "&&";
    }

    @Override
    public Float doOp(Float left, Float right) {
        if (left.intValue() != 1 || right.intValue() != 1) {
            return FALSE;
        }
        return TRUE;
    }

    @Override
    public String operateMulti(Collection<String> left, Collection<String> right) {
        for (String s : left) {
            if (isFalse(s)) {
                return FALSE_STR;
            }
        }
        if (right != null) {
            for (String s : right) {
                if (isFalse(s)) {
                    return FALSE_STR;
                }
            }
        }
        return TRUE_STR;
    }
}
