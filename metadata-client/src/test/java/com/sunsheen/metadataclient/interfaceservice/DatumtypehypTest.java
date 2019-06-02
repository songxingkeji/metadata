package com.sunsheen.metadataclient.interfaceservice;

import com.sunsheen.metadatacom.grpc.common.GrpcResultVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @description: 检索所有的血缘关系信息接口测试
 * @author: zhangxuejiao
 * @createDate: 2019/5/30 17:26
 */
@RunWith(SpringRunner.class)
@SpringBootTest
// 由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class DatumtypehypTest {

    @Autowired
    private DatumtypehypClientGrpcService datumtypehypClientGrpcService;

    /**
     * 获取全部的资料编码与数据元关系数据接口
     */
    @Test
    public void getDatumtypehypTest(){
        String userId = "admin";
        String pwd = "Sunsheen100200";
        String interfaceId = "getDatumtypehyp";
        GrpcResultVO grpcResultVO = datumtypehypClientGrpcService.getDatumtypehyp(userId, pwd, interfaceId);
        System.out.println("=========" + grpcResultVO);
    }
}
