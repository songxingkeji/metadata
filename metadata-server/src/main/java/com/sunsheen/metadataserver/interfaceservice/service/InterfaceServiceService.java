package com.sunsheen.metadataserver.interfaceservice.service;

import java.util.List;
import java.util.Map;

/**
 * @description: 对内grpc接口之业务层接口
 * @author: zhangxuejiao
 * @createDate: 2019/5/31 17:08
 */
public interface InterfaceServiceService {

    /**
     * 获取表字段名
     * @param tableId
     * @return
     */
    List<String> getColumsByTableId(String tableId);

    /**
     * 获取查询条件参数
     * @param tvId
     * @return
     */
    List<Map<String, String>> getParamsByTvId(String tvId);

    /**
     * 获取用户对应接口的信息
     * @param userId
     * @param interfaceId
     * @return
     */
    Map<String, Object> getIntfTableInfo(String userId, String interfaceId);

    /**
     * 获取接口所对应的tvInfo
     * @param interfaceId
     * @return
     */
    Map<String, Object> getIntfTvInfoByInterfaceId(String interfaceId);

    /**
     * 获取接口数据
     * @param tableName
     * @param sqlColumns
     * @param sqlParams
     * @return
     */
    List<Map<String, Object>> getDbData(String tableName, List<String> sqlColumns, List<Map<String, String>> sqlParams);

    /**
     * 对内接口调用插入记录
     * @param recordMap
     */
    void saveRecord(Map<String, String> recordMap);
}
