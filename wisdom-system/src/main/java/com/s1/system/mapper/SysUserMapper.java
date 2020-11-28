package com.s1.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.s1.system.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysUserMapper  extends BaseMapper<SysUserEntity> {

    List<SysUserEntity> selectList();
}
