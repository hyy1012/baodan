package com.shuoxianren.baodan.config.util;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Class Name: com.shuoxianren.baodan.config.util.MyPasswordEncoder
 * ==================================
 * Author Dell Lisufer
 * Date 2020/4/1 17:13
 * Description: MyPasswordEncoder
 * ==================================
 */
public class MyPasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(CharSequence arg0) {
        String str = arg0.toString();
        return str;
    }

    @Override
    public boolean matches(CharSequence arg0, String arg1) {
        boolean bool = arg1.equals(arg0.toString());
        return bool;
    }
}