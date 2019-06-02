package com.sunsheen.metadataclient.interfaceservice;

import com.sunsheen.metadatacom.grpc.common.GrpcResultVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @description: 气象数据元数据获取接口测试
 * @author: zhangxuejiao
 * @createDate: 2019/5/30 17:03
 */
@RunWith(SpringRunner.class)
@SpringBootTest
// 由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class ElementTest {

    @Autowired
    private ElementClientGrpcService elementClientGrpcService;

    /**
     * 气象数据元数据获取接口
     */
    @Test
    public void getElementTest(){
        String userId = "admin";
        String pwd = "Sunsheen100200";
        String interfaceId = "element";
        GrpcResultVO grpcResultVO = elementClientGrpcService.getElement(userId, pwd, interfaceId);
        System.out.println("===========" + grpcResultVO);
    }
}
