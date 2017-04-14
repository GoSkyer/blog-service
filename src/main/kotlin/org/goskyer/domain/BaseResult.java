package org.goskyer.domain;

/**
 * Created by zohar on 2017/4/10.
 * desc:
 */
public class BaseResult<T> {
    private long timestamp;
    private int status;
    private String msg;
    private T data;

    public BaseResult(long timestamp, int status, String msg, T data) {
        this.timestamp = timestamp;
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }


    public static BaseResult build(String msg, Object data) {
        return new BaseResult(System.currentTimeMillis(), 200, msg, data);
    }
}