package com.gwaifaiwong.demo.utils;

import com.gwaifaiwong.demo.VO.ResultVO;

/**
 * @author wangguihui
 * @date 2021/1/7
 */

public class ResultVoUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }
}
