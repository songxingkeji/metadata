package com.sunsheen.metadataserver.systemmanage.usermanage.mapper;

import com.sunsheen.metadataserver.systemmanage.usermanage.pojo.TsUserDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TsUserMapper {

    /**
     * 通过登录用户名查询用户
     * @param userId 登录用户名
     * @return 用户对象
     */
    TsUserDO getTsUserByUserId(@Param("userId") String userId);

    /**
     * 通过登录用户名和密码查询用户
     * @param userId 登录用户名
     * @param pwd 密码
     * @return 用户对象
     */
    TsUserDO getTsUserByUserIdAndPwd(@Param("userId") String userId, @Param("pwd") String pwd);
}
