package matrixexp.mexp;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import matrixexp.mexp.matrix.Step;
import matrixexp.mexp.svc.Converter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Logger;

/**
 * Created by xianfengzhang on 2017/9/5.
 * 
 */
public class CalcCtx {
    public static final String MATRIX_TAG = "matrix";
    public static final String MATRIX_CALC_ACTION = "calc";
    public static final String MATRIX_VALIDATE_ACTION = "validate";
    private static final int MAX_LOG_COUNT = 1000;
    private String rid;
    private String tag;
    private String action;
    private List<String> logs;
    private long lastTime;
    private ObjectMapper om;
    private Map<String, Step> relationLeftValues;
    private Step result;

    public CalcCtx() {
        this(MATRIX_TAG, MATRIX_CALC_ACTION);
    }

    public CalcCtx(String action) {
        this(MATRIX_TAG, action);
    }

    public CalcCtx(String tag, String action) {
        lastTime = System.currentTimeMillis();
        logs = new ArrayList<>();
        this.tag = tag;
        this.action = action;
        UUID uuid = UUID.randomUUID();
        rid = uuid.toString();
        om = new ObjectMapper();
    }

    public String getRid() {
        return rid;
    }

    public void add(String s) {
        if (s == null) {
            return;
        }
        if (logs.size() < MAX_LOG_COUNT) {
            long c = System.currentTimeMillis();
            long d = c - lastTime;
            lastTime = c;
            logs.add(d + "|" + s);
        }
    }

    public void json(Object... o) {
        for (Object v : o) {
            try {
                String s = om.writeValueAsString(v);
                add(s);
            } catch (JsonProcessingException e) {
                //  异常就扔掉
            }
        }
    }

    public void error(Throwable e) {
        add(Converter.getStackTrace(e));
    }

    public List<String> getLogs() {
        List<String> r = new ArrayList<>(logs.size());
        for (String s : logs) {
            r.add(toLog(s));
        }
        return r;
    }

    public void flush(Logger l) {
        for (String s : logs) {
            String ts = toLog(s);
            l.info(ts);
        }
    }

    String toLog(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append("[[cat=");
        sb.append(tag);
        sb.append(",action=");
        sb.append(action);
        sb.append(",rid=");
        sb.append(rid);
        sb.append("]]");
        sb.append(s);
        return sb.toString();
    }

    public Map<String, Step> getRelationLeftValues() {
        return relationLeftValues;
    }

    public void setRelationLeftValues(Map<String, Step> relationLeftValues) {
        this.relationLeftValues = relationLeftValues;
    }

    public Step getResult() {
        return result;
    }

    public void setResult(Step result) {
        this.result = result;
    }
}
