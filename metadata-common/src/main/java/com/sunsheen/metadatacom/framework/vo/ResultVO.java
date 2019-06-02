package com.sunsheen.metadatacom.framework.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

/**
 * @Description: http请求返回的最外层对象
 * @Author:  zhangxuejiao
 * @CreateDate:  2019/3/27 11:30
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = -5567158279004917024L;

    private Integer code; //结果码

    private String msg; // 提示信息

    private T data; // 具体内容
}
