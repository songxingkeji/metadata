package com.sunsheen.metadataclient.interfaceservice;

import com.sunsheen.metadatacom.grpc.common.GrpcResultVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @description: 资料编码与数据元关系数据接口测试
 * @author: zhangxuejiao
 * @createDate: 2019/5/30 17:08
 */
@RunWith(SpringRunner.class)
@SpringBootTest
// 由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class DatumtypeelmTest {

    @Autowired
    private DatumtypeelmClientGrpcService datumtypeelmClientGrpcService;

    /**
     * 获取全部的资料编码与数据元关系数据接口
     */
    @Test
    public void getDatumtypeelmTest(){
        String userId = "admin";
        String pwd = "Sunsheen100200";
        String interfaceId = "datumtypeelm";
        GrpcResultVO grpcResultVO = datumtypeelmClientGrpcService.getDatumtypeelm(userId, pwd, interfaceId);
        System.out.println("=========" + grpcResultVO);
    }

    /**
     * 获取指定资料编码与数据元的关系数据接口
     */
    @Test
    public void getElementsInfoByDatumCodeTest(){
        String userId = "admin";
        String pwd = "Sunsheen100200";
        String interfaceId = "getElementsInfoByCode";
        String datumCode = "A.00A1.0001";
        GrpcResultVO grpcResultVO = datumtypeelmClientGrpcService.getElementsInfoByDatumCode(userId, pwd, interfaceId, datumCode);
        System.out.println("=========" + grpcResultVO);
    }
}
