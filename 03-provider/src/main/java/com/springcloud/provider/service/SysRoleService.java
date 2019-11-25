package com.springcloud.provider.service;

import com.springcloud.provider.bean.SysRole;
import com.springcloud.provider.mapper.SysRoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysRoleService {

    @Autowired
    private SysRoleDao dao;

    public List<SysRole> getList(){
        List<SysRole> list = dao.getList();
        return list;
    }

}
