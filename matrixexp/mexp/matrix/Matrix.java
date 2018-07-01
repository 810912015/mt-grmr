package matrixexp.mexp.matrix;

import java.util.List;
import java.util.Map;

/**
 * 矩阵:包含列名和行标志的二维数组
 * <p>
 * Created by xianfengzhang on 2017/8/24.
 */
public interface Matrix {
    /**
     * 是否包含列
     *
     * @param colName 列名
     * @return
     */
    boolean hasCol(String colName);


    /**
     * 根据行标志取出对应列的值
     *
     * @param colNames 行标志
     * @return 行标志:{列标志:值}
     */
    Map<String, Map<String, String>> getValues(String... colNames);

    /**
     * 获取行标志列
     *
     * @return
     */
    List<String> getRowKeys();

    /**
     * 获取列名列表
     *
     * @return
     */
    List<String> getCols();

    /**
     * 获取计算的最后结果
     * 如:A>B,如果A的所有值都大于B的值,则为true,否则为false
     *
     * @return
     */
    Boolean boolValue();

    void setIsBool(boolean value);

    String[][] getContent();

    String getKeyString();
}
