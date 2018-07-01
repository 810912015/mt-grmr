package matrixexp.mexp.matrix;


/**
 * Created by xianfengzhang on 2017/3/17.
 */
public class Result<T> {

    private boolean success;

    private String msg;

    private T data;

    public Result() {
    }

    /**
     * @param s 　描述为空
     */
    public Result(boolean s) {
        this.success = s;
        this.msg = "";
    }

    public Result(boolean s, T data) {
        this.success = s;
        this.msg = "";
        this.data = data;
    }

    /**
     * @param msg 如果有描述，说明不成功
     */
    public Result(String msg) {
        this.success = false;
        this.msg = msg;
    }

    public Result(boolean success, String msg, T data) {
        this.success = success;
        this.msg = msg;
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "success=" + success +
                ", msg='" + getObjString(msg) + '\'' +
                ", data=" + getObjString(data) +
                '}';
    }

    String getObjString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString();
    }
}
