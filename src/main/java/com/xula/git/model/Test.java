package com.xula.git.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @email: xuliandream@gmail.com
 * @author: xula
 * @date: 2021/3/1
 * @time: 16:35
 */
@Component
public class Test implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        System.out.println("测试。。。。。。");
    }
}
