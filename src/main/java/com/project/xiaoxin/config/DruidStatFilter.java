package com.project.xiaoxin.config;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * @program: project_one
 * @description: Druid拦截器，用于查看Druid监控
 * @author: andraw
 * @create: 2019-03-14 12:06
 */
@WebFilter(filterName = "druidWebStatFilter", urlPatterns = "/*", initParams = {
        @WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")//忽略资源
})//@WebFilter 表明此类是一个拦截器
public class DruidStatFilter extends WebStatFilter {
}
