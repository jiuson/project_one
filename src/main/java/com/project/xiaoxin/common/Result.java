package com.project.xiaoxin.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Result<P> {

    private boolean success;
    private int errorCode;
    private String errorMessage;
    private P payload;

    public P deserialize(){
        if (!this.success){
            throw new BusinessException(this.errorCode, this.errorMessage);
        }else {
            return this.payload;
        }
    }

    public static Result<Void> success(){
        Result<Void> instance = new Result<>();
        instance.setSuccess(true);
        return instance;
    }

    public static <P> Result<P> success(P payload){
        Result<P> instance = new Result<>();
        instance.setSuccess(true);
        instance.setPayload(payload);
        return instance;
    }

    public static Result<Void> failed(BusinessException be){
        Result<Void> instance = new Result<>();
        instance.setErrorCode(be.getErrorCode());
        instance.setErrorMessage(be.getMessage());
        return instance;
    }

    public static <P> Result<P> failed(BusinessException be, P payload){
        Result<P> instance = new Result<>();
        instance.setErrorCode(be.getErrorCode());
        instance.setErrorMessage(be.getMessage());
        instance.setPayload(payload);
        instance.setSuccess(false);
        return instance;
    }
}
