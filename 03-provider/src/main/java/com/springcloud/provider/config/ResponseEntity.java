package com.springcloud.provider.config;

public class ResponseEntity<T> {

    private String statuc;
    private String code;

    private T data;

    public String getStatuc() {
        return statuc;
    }

    public void setStatuc(String statuc) {
        this.statuc = statuc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
