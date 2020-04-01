package com.shuoxianren.baodan.entity.dto;

import com.shuoxianren.baodan.entity.Admin;
import com.shuoxianren.baodan.entity.Role;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Class Name: com.shuoxianren.baodan.entity.dto.AdminDto
 * ==================================
 * Author Dell Lisufer
 * Date 2020/4/1 14:39
 * Description: AdminDto
 * ==================================
 */
@Data
public class AdminDto extends Admin implements UserDetails {

    private List<Role> roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> authorities = new ArrayList<>(roles.size());
        for (Role role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getRole()));
        }
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
