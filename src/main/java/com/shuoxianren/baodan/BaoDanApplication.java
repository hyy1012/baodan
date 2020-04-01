package com.shuoxianren.baodan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Class Name: PACKAGE_NAME.com.shuoxianren.baodan.BaoDanApplication
 * ==================================
 * Author Dell Lisufer
 * Date 2020/4/1 10:51
 * Description: com.shuoxianren.baodan.BaodanApplication
 * ==================================
 */
@SpringBootApplication
@MapperScan("com.shuoxianren.baodan.mapper")
public class BaoDanApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaoDanApplication.class, args);
    }

}
