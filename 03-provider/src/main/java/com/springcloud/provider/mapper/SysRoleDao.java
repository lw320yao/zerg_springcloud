package com.springcloud.provider.mapper;

import com.springcloud.provider.bean.SysRole;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface SysRoleDao {

    List<SysRole> getList();
}
