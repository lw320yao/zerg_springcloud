package com.springcloud.provider.mapper;

import com.springcloud.provider.bean.SysUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface SysUserDao {

    SysUser selectByPrimaryKey(@Param("id") Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByExample(SysUser record);

    int insert(SysUser record);

    int deleteByPrimaryKey(Long id);
}
