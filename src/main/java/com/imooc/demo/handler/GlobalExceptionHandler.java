package com.imooc.demo.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ljd on 2020/9/9.
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value=Exception.class)
    @ResponseBody
    private Map<String,Object> exceptionHandler(HttpServletRequest req, Exception e){
        Map<String,Object> modeMap = new HashMap<>();
        modeMap.put("success",false);
        modeMap.put("errMsg",e.getMessage());
        return modeMap;
    }
}
