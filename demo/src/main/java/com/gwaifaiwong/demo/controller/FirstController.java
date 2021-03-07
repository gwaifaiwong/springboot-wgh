package com.gwaifaiwong.demo.controller;

import com.gwaifaiwong.demo.VO.ResultVO;
import com.gwaifaiwong.demo.utils.ResultVoUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @author wangguihui
 * @date 2021/1/7
 */

@RestController
public class FirstController {

    @GetMapping(path ={ "/first"})
    public ResultVO test(){
        return ResultVoUtil.success("hello spring security user: " + getUser()) ;
    }

    public String getUser() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getRemoteUser();
    }
}
