package com.springcloud.provider.controller;

import com.springcloud.provider.bean.SysUser;
import com.springcloud.provider.service.SysUserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SysUserController {

    @Autowired
    private SysUserService service;

    @PostMapping("/sysUser/save")
    @ApiOperation(value= "新增方法")
    public Integer save(@RequestBody() SysUser user){
        Integer save = service.save(user);
        return save;
    }

    @GetMapping("/findSysUserById/{id}")
    public SysUser findSysUserById(@PathVariable("id") Long id){
        SysUser sysUser = service.selectByPrimaryKey(id);
        return sysUser;
    }
}
