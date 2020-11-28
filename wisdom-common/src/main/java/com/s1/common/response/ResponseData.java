package com.s1.common.response;

import lombok.Data;

import java.io.Serializable;

/**
 * ResponseData作为统一返回得实体，由ResponseData作为容器把消息返回。其结构也超级简单，
 * 需要三个组件： ResponseData、 ResponseDataUtils、 ResultEnum
 * @param <T>
 */
@Data
public class ResponseData<T> implements Serializable {

    private String code;

    private String msg;

    private T data;


    public ResponseData(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResponseData(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseData(ResultEnums resultEnums) {
        this.code = resultEnums.getCode();
        this.msg = resultEnums.getMsg();
    }

    public ResponseData(ResultEnums resultEnums, T data) {
        this.code = resultEnums.getCode();
        this.msg = resultEnums.getMsg();
        this.data = data;
    }

    public ResponseData() {
    }



}