package com.rdlts.jsbs.ddd;

import org.springframework.boot.SpringApplication;

/**
 * TestApplication
 * 区别于项目包下的Spring Boot程序，这个专门用于测试类的启动
 *
 * @author wangjialong
 * @since 2025/11/26 11:12
 */
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
