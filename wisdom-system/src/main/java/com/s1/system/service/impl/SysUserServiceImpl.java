package com.s1.system.service.impl;

import com.s1.system.entity.SysUserEntity;
import com.s1.system.mapper.SysUserMapper;
import com.s1.system.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements ISysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    public List<SysUserEntity> selectList(){
        return sysUserMapper.selectList();
    }
}
