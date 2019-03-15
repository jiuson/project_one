package com.project.xiaoxin.common;

import lombok.Getter;

/**
 * @program: project_one
 * @description: general exception
 * @author: andraw
 * @create: 2019-03-15 15:12
 */
@Getter
public class GeneralException extends RuntimeException{

    private int errorCode;

    public GeneralException(String msg){
        super(msg);
        this.errorCode = -1;
    }

    public GeneralException(int errorCode, String msg){
        super(msg);
        this.errorCode = errorCode;
    }
}
