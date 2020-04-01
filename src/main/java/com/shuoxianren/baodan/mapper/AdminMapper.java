package com.shuoxianren.baodan.mapper;

import com.shuoxianren.baodan.MyMapper;
import com.shuoxianren.baodan.entity.Admin;
import com.shuoxianren.baodan.entity.Role;
import com.shuoxianren.baodan.entity.dto.AdminDto;

import java.util.List;

public interface AdminMapper extends MyMapper<Admin> {

    AdminDto loadUserByUsername(String username);

    List<Role> getRolesByAdminId(Integer id);

}