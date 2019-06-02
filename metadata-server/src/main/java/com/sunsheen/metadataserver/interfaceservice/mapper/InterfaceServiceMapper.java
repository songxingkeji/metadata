package com.sunsheen.metadataserver.interfaceservice.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @description: 对内grpc接口之mapper
 * @author: zhangxuejiao
 * @createDate: 2019/5/31 17:07
 */
@Mapper
public interface InterfaceServiceMapper {

    /**
     * 获取表字段名
     * @param tableId
     * @return
     */
    List<String> getColumsByTableId(@Param("tableId") String tableId);

    /**
     * 获取查询条件参数
     * @param tvId
     * @return
     */
    List<Map<String, String>> getParamsByTvId(@Param("tvId") String tvId);

    /**
     * 获取用户对应接口的信息
     * @param userId
     * @param interfaceId
     * @return
     */
    Map<String, Object> getIntfTableInfo(@Param("userId") String userId, @Param("interfaceId") String interfaceId);

    /**
     * 获取接口所对应的tvInfo
     * @param interfaceId
     * @return
     */
    Map<String, Object> getIntfTvInfoByInterfaceId(@Param("interfaceId") String interfaceId);

    /**
     * 获取接口数据
     * @param tableName
     * @param sqlColumns
     * @param sqlParams
     * @return
     */
    List<Map<String, Object>> getDbData(@Param("tableName") String tableName, @Param("sqlColumns") List<String> sqlColumns, @Param("sqlParams") List<Map<String, String>> sqlParams);

    /**
     * 对内接口调用插入记录
     * @param recordMap
     */
    void saveRecord(@Param("recordMap") Map<String, String> recordMap);
}
