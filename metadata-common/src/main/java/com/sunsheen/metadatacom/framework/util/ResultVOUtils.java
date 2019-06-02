package com.sunsheen.metadatacom.framework.util;

import com.sunsheen.metadatacom.framework.vo.ResultVO;

/**
 * @Description: 返回的封装结果 Util
 * @Author:  zhangxuejiao
 * @CreateDate:  2019/3/27 13:52
 */
public class ResultVOUtils {

    /**
     * code: 0 成功
     * 成功，并带有返回的数据
     * @param object
     * @return
     */
    public static ResultVO success(String msg, Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg(msg);
        return resultVO;
    }

    /**
     * 成功，但没有返回的数据
     * @return
     */
    public static ResultVO success(String msg){
        return success(msg, null);
    }

    /**
     * code: 1 通用的失败, 2 用户未登录
     * @param msg
     * @return
     */
    public static ResultVO error(Integer code, String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
