package com.project.xiaoxin.common;

import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {

    private int errorCode;

    public BusinessException(String msg){
        super(msg);
        this.errorCode = -1;
    }

    public BusinessException(int errorCode, String msg){
        super(msg);
        this.errorCode = errorCode;
    }
}
