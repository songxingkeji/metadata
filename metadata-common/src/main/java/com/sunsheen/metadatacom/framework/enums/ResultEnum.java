package com.sunsheen.metadatacom.framework.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {

    SUCCESS(0, "操作成功"),

    FAIL(-1, "操作失败")
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
