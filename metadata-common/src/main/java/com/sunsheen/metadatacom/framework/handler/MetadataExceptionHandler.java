package com.sunsheen.metadatacom.framework.handler;

import com.sunsheen.metadatacom.framework.exception.MetadataException;
import com.sunsheen.metadatacom.framework.util.ResultVOUtils;
import com.sunsheen.metadatacom.framework.vo.ResultVO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description: 拦截（捕获）异常
 * @author: zhangxuejiao
 * @createDate: 2019/5/19 21:02
 */
@ControllerAdvice
//@ControllerAdvice：用来处理异常；如果单使用@ExceptionHandler，只能在当前Controller中处理异常，但当配合@ControllerAdvice一起使用的时候，就可以摆脱那个限制了
public class MetadataExceptionHandler {

    /**
     * 拦截校验异常
     * @return
     */
    @ExceptionHandler(value = MetadataException.class)
    @ResponseBody
    public ResultVO handlerMetadataException(MetadataException e){
        return ResultVOUtils.error(e.getCode(), e.getMessage());
    }
}
