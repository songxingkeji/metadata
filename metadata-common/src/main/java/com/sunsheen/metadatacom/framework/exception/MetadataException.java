package com.sunsheen.metadatacom.framework.exception;

import com.sunsheen.metadatacom.framework.vo.ResultVO;
import lombok.Getter;

/**
 * @description: app用户校验是否登录异常
 * @author: zhangxuejiao
 * @createDate: 2019/5/19 21:01
 */
@Getter
public class MetadataException extends RuntimeException {

    private Integer code;

    public MetadataException(ResultVO resultVO) {
        super(resultVO.getMsg());
        this.code = resultVO.getCode();
    }

    public MetadataException(Integer code, String msg){
        super(msg);
        this.code = code;
    }
}
