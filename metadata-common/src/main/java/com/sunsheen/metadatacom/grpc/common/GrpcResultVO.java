package com.sunsheen.metadatacom.grpc.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description: grpc请求返回的对象
 * @Author:  zhangxuejiao
 * @CreateDate:  2019/3/27 11:30
 */
@Data
public class GrpcResultVO<T> implements Serializable {

    private static final long serialVersionUID = 4214662832333897891L;

    private Integer code; //结果码

    private String msg; // 提示信息

    private T data; // 具体内容
}
