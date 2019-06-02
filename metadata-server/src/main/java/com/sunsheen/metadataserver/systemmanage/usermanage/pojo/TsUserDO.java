package com.sunsheen.metadataserver.systemmanage.usermanage.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class TsUserDO {

    /**
     * 用户ID
     */
    @Id
    private String tsUserId;

    /**
     * 登录用户名
     */
    private String account;

    /**
     * 登录密码
     */
    private String password;
}
