package com.project.xiaoxin.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: project_one
 * @description: base controller
 * @author: andraw
 * @create: 2019-03-15 15:11
 */
@Slf4j
public abstract class BaseController {

    @ExceptionHandler({GeneralException.class})
    public ResponseResult<Void> businessExceptionHandler(HttpServletRequest request, GeneralException be){
        log.info(String.valueOf(be.getErrorCode()), be);
        ResponseResult<Void> response = ResponseResult.failed(be);
        return response;
    }

    public String getRemoteIp(HttpServletRequest request){
        return request.getHeader("x-forwarded-for") == null ? request.getRemoteAddr() : request.getHeader("x-forwarded-for");
    }
}
