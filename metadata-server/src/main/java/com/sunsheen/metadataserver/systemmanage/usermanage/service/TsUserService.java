package com.sunsheen.metadataserver.systemmanage.usermanage.service;

import com.sunsheen.metadataserver.systemmanage.usermanage.pojo.TsUserDO;

public interface TsUserService {

    /**
     * 通过登录用户名查询用户
     * @param userId 登录用户名
     * @return 用户对象
     */
    TsUserDO getTsUserByUserId(String userId);

    /**
     * 通过登录用户名和密码查询用户
     * @param userId 登录用户名
     * @param pwd 密码
     * @return 用户对象
     */
    TsUserDO getTsUserByUserIdAndPwd(String userId, String pwd);
}
