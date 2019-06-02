package com.sunsheen.metadataserver.systemmanage;

import com.sunsheen.metadataserver.systemmanage.usermanage.pojo.TsUserDO;
import com.sunsheen.metadataserver.systemmanage.usermanage.service.TsUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
// 由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class TsUserTest {

    @Autowired
    private TsUserService tsUserService;

    @Test
    public void getTsUserByUserId(){
        TsUserDO tsUser = tsUserService.getTsUserByUserId("admin");
        System.out.println(tsUser);
    }
}
