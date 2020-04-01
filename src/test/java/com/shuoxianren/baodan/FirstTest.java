package com.shuoxianren.baodan;

import com.shuoxianren.baodan.entity.dto.AdminDto;
import com.shuoxianren.baodan.mapper.AdminMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Class Name: com.shuoxianren.test.FirstTest
 * ==================================
 * Author Dell Lisufer
 * Date 2020/4/1 17:43
 * Description: FirstTest
 * ==================================
 */
@SpringBootTest
public class FirstTest {

    @Autowired
    AdminMapper adminMapper;

    @Test
    public void test1(){
        AdminDto adminDto = adminMapper.loadUserByUsername("guest");
        System.out.println(adminDto);
    }

}
