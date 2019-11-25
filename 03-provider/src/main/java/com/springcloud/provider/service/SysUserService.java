package com.springcloud.provider.service;

import com.springcloud.provider.bean.SysUser;
import com.springcloud.provider.mapper.SysUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserService {

    @Autowired
    private SysUserDao sysUserDao;

    public Integer save(SysUser user){
        int insert = sysUserDao.insert(user);
        return insert;
    }

    public Integer update(SysUser user){
        int insert = sysUserDao.updateByPrimaryKeySelective(user);
        return insert;
    }

    public SysUser selectByPrimaryKey(Long id){
        SysUser sysUser = sysUserDao.selectByPrimaryKey(id);
        return sysUser;
    }
}
