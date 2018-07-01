package matrixexp.mexp.matrix;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xianfengzhang
 * @date 2018/3/29
 * 比如:
 * A
 * 1  1  1
 * 1  aa  80  ed
 * 2  aa  85  cv
 * 3  bb  78  vf
 * 字符串2维数组,约定第一行表示列名,除第一行外每行有一个标志(1列或多列)
 * Created by xianfengzhang on 2017/8/24.
 */
public class ArrayMatrix implements Matrix {
    private String[][] content;
    private String[] key;
    private String name;
    private int[] keyIndex;
    private Boolean isTrue;
    private boolean isBool;
    private String ks;

    public ArrayMatrix(String name, String[][] content, String... rid) {
        if (content == null || content.length == 0) {
            throw new IllegalArgumentException("数据不能为空,且至少有包含列名的第一列");
        }
        if (rid == null || rid.length == 0) {
            throw new IllegalArgumentException("列标志不能为空");
        }
        this.name = name;
        this.content = content;
        this.key = rid;
        keyIndex = getColIndexes(this.content, key);
        isTrue = null;
        isBool = false;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rid.length; i++) {
            if (i > 0) {
                sb.append("-");
            }
            sb.append(rid[i]);
        }
        ks = sb.toString();
    }

    public static int getColIndex(String[][] content, String colName) {
        if (colName == null) {
            return -1;
        }
        for (int i = 0; i < content[0].length; i++) {
            if (content[0][i].equalsIgnoreCase(colName)) {
                return i;
            }
        }
        return -1;
    }

    public static int[] getColIndexes(String[][] content, String[] cn) {
        int[] r = new int[cn.length];
        for (int i = 0; i < r.length; i++) {
            int rit = getColIndex(content, cn[i]);
            r[i] = rit;
        }
        return r;
    }

    @Override
    public String[][] getContent() {
        return content;
    }

    @Override
    public String getKeyString() {
        return ks;
    }

    @Override
    public boolean hasCol(String colName) {
        if (colName == null) {
            return false;
        }
        for (String s : content[0]) {
            if (s.equalsIgnoreCase(colName)) {
                return true;
            }
        }
        return false;
    }

    public String makeKey(int i) {
        if (i >= content.length || i < 0) {
            return "";
        }
        StringBuilder ksb = new StringBuilder();
        for (int j = 0; j < keyIndex.length; j++) {
            if (j > 0) {
                ksb.append("-");
            }
            int k = keyIndex[j];
            if (k > -1) {
                ksb.append(content[i][k]);
            }
        }
        return ksb.toString();
    }

    @Override
    public Map<String, Map<String, String>> getValues(String... colNames) {
        int[] ci = getColIndexes(this.content, colNames);
        Map<String, Map<String, String>> r = new HashMap<>();
        for (int i = 1; i < content.length; i++) {
            String ksb = makeKey(i);
            Map<String, String> t = new HashMap<>();
            for (int j = 0; j < ci.length; j++) {
                if (ci[j] == -1) {
                    continue;
                }
                t.put(colNames[j], content[i][ci[j]]);
            }
            r.put(ksb, t);
        }
        return r;
    }

    @Override
    public List<String> getRowKeys() {
        return Arrays.asList(key);
    }

    @Override
    public List<String> getCols() {
        return Arrays.asList(content[0]);
    }

    @Override
    public Boolean boolValue() {
        if (!isBool) {
            return false;
        }
        // 除了行标志外的列都是null或等于1,则为true,否则为false
        if (isTrue == null) {
            isTrue = calBool();
        }
        return isTrue;
    }

    @Override
    public void setIsBool(boolean value) {
        isBool = value;
    }

    boolean calBool() {
        for (int i = 1; i < content.length; i++) {
            for (int j = 0; j < content[i].length; j++) {
                boolean isKey = isKey(j);
                if (!isKey) {
                    String t = content[i][j];
                    if (t != null && !"1.0".equals(t)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }


    boolean isKey(int i) {
        boolean isKey = false;
        for (int j = 0; j < keyIndex.length; j++) {
            if (keyIndex[j] == i) {
                isKey = true;
                break;
            }
        }
        return isKey;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ArrayMatrix{");
        sb.append("content=[");
        for (int i = 0; i < content.length; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(Arrays.toString(content[i]));
        }
        sb.append("], key=" + Arrays.toString(key));
        sb.append(", name='" + name + '\'');
        sb.append(", keyIndex=" + Arrays.toString(keyIndex));
        sb.append(",isBool=");
        sb.append(isBool);
        sb.append(",boolValue=");
        sb.append(getBv());
        sb.append("}");
        return sb.toString();
    }

    String getBv() {
        if (!isBool) {
            return "null";
        }
        if (boolValue()) {
            return "true";
        } else {
            return "false";
        }
    }
}
