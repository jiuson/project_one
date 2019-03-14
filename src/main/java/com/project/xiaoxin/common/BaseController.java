package com.project.xiaoxin.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@Slf4j
public abstract class BaseController {

    @ExceptionHandler({BusinessException.class})
    public Result<Void> businessExceptionHandler(HttpServletRequest request, BusinessException be){
        log.info(String.valueOf(be.getErrorCode()), be);
        Result<Void> response = Result.failed(be);
        return response;
    }

    public String getRemoteIp(HttpServletRequest request){
        return request.getHeader("x-forwarded-for") == null ? request.getRemoteAddr() : request.getHeader("x-forwarded-for");
    }

}
