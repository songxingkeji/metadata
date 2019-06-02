package com.sunsheen.metadataserver.systemmanage.usermanage.service.impl;

import com.sunsheen.metadataserver.systemmanage.usermanage.mapper.TsUserMapper;
import com.sunsheen.metadataserver.systemmanage.usermanage.pojo.TsUserDO;
import com.sunsheen.metadataserver.systemmanage.usermanage.service.TsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TsUserServiceImpl implements TsUserService {

    @Autowired
    private TsUserMapper tsUserMapper;

    /**
     * 通过登录用户名查询用户
     * @param userId 登录用户名
     * @return 用户对象
     */
    @Override
    public TsUserDO getTsUserByUserId(String userId) {
        return tsUserMapper.getTsUserByUserId(userId);
    }

    /**
     * 通过登录用户名和密码查询用户
     * @param userId 登录用户名
     * @param pwd 密码
     * @return 用户对象
     */
    @Override
    public TsUserDO getTsUserByUserIdAndPwd(String userId, String pwd) {
        return tsUserMapper.getTsUserByUserIdAndPwd(userId, pwd);
    }
}
