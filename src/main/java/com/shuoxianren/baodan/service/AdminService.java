package com.shuoxianren.baodan.service;

import com.shuoxianren.baodan.entity.dto.AdminDto;
import com.shuoxianren.baodan.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Class Name: com.shuoxianren.baodan.service.AdminService
 * ==================================
 * Author Dell Lisufer
 * Date 2020/4/1 14:26
 * Description: AdminService
 * ==================================
 */
@Service
public class AdminService implements UserDetailsService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AdminDto admin = adminMapper.loadUserByUsername(username);
        if (admin == null) {
            throw new UsernameNotFoundException("用户名不存在!");
        }
//        admin.setPassword("{noop}"+admin.getPassword());
        admin.setRoles(adminMapper.getRolesByAdminId(admin.getId()));
        return admin;
    }
}
