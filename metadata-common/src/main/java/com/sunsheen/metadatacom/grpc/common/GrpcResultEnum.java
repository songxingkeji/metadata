package com.sunsheen.metadatacom.grpc.common;

import lombok.Getter;

@Getter
public enum GrpcResultEnum {

    CALL_SUCCEED(0, "调用成功"),

    USER_VERIFY_ERROR(1, "用户验证失败"),

    MISMATCHING_INTERFACEID_DATACODE(2, "接口与资料不匹配"),

    PARAMETER_ERROR(3, "参数错误"),

    NO_ACCESS_AUTHORITY(4, "没有访问权限"),

    OUT_OF_RANGE_ERROR(5, "单次请求范围过大"),

    SERVER_CONNECT_ERROR(6, "服务器连接错误"),

    SQL_ERROR(7, "数据库操作错误"),

    FILE_ERROR(8, "文件错误"),

    SERVER_HANDLE_ERROR(9, "服务端处理异常"),

    OTHER_ERROR(10, "其他错误"),

    NO_DATA_IS_RETRIEVED(-1, "没有获取到数据"),

    MISSING_USERID(-10001, "用户名缺失"),

    USERID_ERROR(-10002, "用户不正确"),

    MISSING_PASSWORD(-10003, "密码缺失"),

    PASSWORD_ERROR(-10004, "密码错误"),

    INTERFACEID_ERROR(-20001, "接口名不正确"),

    DATACODE_ERROR(-20002, "资料代码不正确"),

    PARAMETER_VALUE_ERROR(-30001, "参数赋值错误"),

    MISSING_PARAMETER(-30002, "参数缺失"),

    USELESS_PARAMETER(-30003, "参数多余或未定义"),

    NO_RIGHT_TO_ACCESS_THE_DATA(-40001, "没有访问该数据的权限"),

    NO_RIGHT_TO_ACCESS_THE_HISTORY_DATA(-40002, "没有访问该历史数据的权限"),

    TIME_SPAN_IS_OUT_OF_RANGE(-50001, "检索的时间跨度超过范围"),

    TIME_PARAMETER_NUMBER_EXCEEDS_THE_LIMIT(-50002, "检索的时间点个数超过限制"),

    FAILED_TO_CONNECT_SERVER(-60001, "服务器连接失败"),

    DBSQL_ERROR(-70001, "SQL错误")
    ;

    private Integer code;

    private String message;

    GrpcResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
