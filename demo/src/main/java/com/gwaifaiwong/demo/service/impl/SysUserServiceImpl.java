package com.gwaifaiwong.demo.service.impl;

import com.gwaifaiwong.demo.entity.SysUser;
import com.gwaifaiwong.demo.mapper.SysUserMapper;
import com.gwaifaiwong.demo.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户表 服务实现类
 * </p>
 *
 * @author gwaifaiwong
 * @since 2021-03-07
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}
