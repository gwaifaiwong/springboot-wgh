package com.gwaifaiwong.demo.VO;

import lombok.Data;

/**
 * @author wangguihui
 * @date 2021/1/7
 */

@Data
public class ResultVO<T> {

    /**状态码*/
    private Integer code;

    /**提示信息*/
    private String msg;

    /**具体内容*/
    private T data;
}
