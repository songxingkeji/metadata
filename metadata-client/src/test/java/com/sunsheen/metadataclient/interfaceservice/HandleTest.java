package com.sunsheen.metadataclient.interfaceservice;

import com.sunsheen.metadatacom.grpc.common.GrpcResultVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @description: 按资料编码检索总控处理表接口测试
 * @author: zhangxuejiao
 * @createDate: 2019/5/30 17:03
 */
@RunWith(SpringRunner.class)
@SpringBootTest
// 由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class HandleTest {

    @Autowired
    private HandleClientGrpcService handleClientGrpcService;

    /**
     * 按资料编码检索总控处理表接口
     */
    @Test
    public void getHandleByDatumCodeTest(){
        String userId = "admin";
        String pwd = "Sunsheen100200";
        String interfaceId = "handle_bydaumcode";
        String datumCode = "A.0001.0010.R001";
        GrpcResultVO grpcResultVO = handleClientGrpcService.getHandleByDatumCode(userId, pwd, interfaceId, datumCode);
        System.out.println("===========" + grpcResultVO);
    }
}
