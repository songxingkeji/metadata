package com.sunsheen.metadataserver.interfaceservice.service.impl;

import com.sunsheen.metadataserver.interfaceservice.mapper.InterfaceServiceMapper;
import com.sunsheen.metadataserver.interfaceservice.service.InterfaceServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @description: 对内grpc接口之业务层接口实现类
 * @author: zhangxuejiao
 * @createDate: 2019/5/31 17:08
 */
@Service
public class InterfaceServiceServiceImpl implements InterfaceServiceService {

    @Autowired
    private InterfaceServiceMapper interfaceServiceMapper;

    /**
     * 获取表字段名
     * @param tableId
     * @return
     */
    @Override
    public List<String> getColumsByTableId(String tableId) {
        return interfaceServiceMapper.getColumsByTableId(tableId);
    }

    /**
     * 获取查询条件参数
     * @param tvId
     * @return
     */
    @Override
    public List<Map<String, String>> getParamsByTvId(String tvId) {
        return interfaceServiceMapper.getParamsByTvId(tvId);
    }

    /**
     * 获取用户对应接口的信息
     * @param userId
     * @param interfaceId
     * @return
     */
    @Override
    public Map<String, Object> getIntfTableInfo(String userId, String interfaceId) {
        return interfaceServiceMapper.getIntfTableInfo(userId, interfaceId);
    }

    /**
     * 获取接口所对应的tvInfo
     * @param interfaceId
     * @return
     */
    @Override
    public Map<String, Object> getIntfTvInfoByInterfaceId(String interfaceId) {
        return interfaceServiceMapper.getIntfTvInfoByInterfaceId(interfaceId);
    }

    /**
     * 获取接口数据
     * @param tableName
     * @param sqlColumns
     * @param sqlParams
     * @return
     */
    @Override
    public List<Map<String, Object>> getDbData(String tableName, List<String> sqlColumns, List<Map<String, String>> sqlParams) {
        return interfaceServiceMapper.getDbData(tableName, sqlColumns, sqlParams);
    }

    /**
     * 对内接口调用插入记录
     * @param recordMap
     */
    @Override
    public void saveRecord(Map<String, String> recordMap) {
        interfaceServiceMapper.saveRecord(recordMap);
    }
}
