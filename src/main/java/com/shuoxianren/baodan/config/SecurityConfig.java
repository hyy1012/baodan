package com.shuoxianren.baodan.config;

import com.shuoxianren.baodan.config.util.MyPasswordEncoder;
import com.shuoxianren.baodan.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Class Name: com.shuoxianren.baodan.config.SecurityConfig
 * ==================================
 * Author Dell Lisufer
 * Date 2020/4/1 11:47
 * Description: SecurityConfig
 * ==================================
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    AdminService adminService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
         auth.userDetailsService(adminService).passwordEncoder(new MyPasswordEncoder());
//        auth.inMemoryAuthentication().passwordEncoder(new MyPasswordEncoder())
//                .withUser("guest").password("guest").roles("guest");
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/css/**","/js/**","/img/**","/fonts/**","/favicon.ico","/verifyCode");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()// 开启登录配置
        // .antMatchers("/").permitAll() 首页所有人都可以访问
        .antMatchers("/user").hasRole("admin")
        .antMatchers("/say").hasRole("guest")
        ;

        http.csrf().disable();
        http.formLogin();
        http.logout();

    }
}
