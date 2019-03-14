package com.project.xiaoxin.service;

import com.project.xiaoxin.common.BaseController;
import com.project.xiaoxin.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Slf4j
public class TestService extends BaseController {

    @GetMapping
    public Result<Void> test(){
        log.info("hello, this is test");
        return Result.success(null);
    }
}
