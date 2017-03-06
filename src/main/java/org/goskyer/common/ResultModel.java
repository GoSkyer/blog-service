package org.goskyer.common;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * Created by OoO on 2017/3/5.
 */
public class ResultModel<T> implements Serializable {

    private static final Gson formatter = new Gson();

    private String msg;
    private int code;
    private Object result;

    public ResultModel() {

    }

    public ResultModel(Object result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getResult() {
        return (T)result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String toJSON() {
        return formatter.toJson(this);
    }

}
