package com.springcloud.provider.controller;

import com.springcloud.provider.bean.SysRole;
import com.springcloud.provider.mapper.SysRoleDao;
import com.springcloud.provider.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SysRoleController {

    @Autowired
    private SysRoleService service;

    @GetMapping("/getList")
    public List<SysRole> getList(){
        List<SysRole> list = service.getList();
        return list;
    }
}
