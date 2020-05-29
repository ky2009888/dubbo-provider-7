package com.order.dubbo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 功能描述:
 * 项目名称:order-dubbo
 * 创建日期:2020/5/28
 *
 * @author Lenovo
 */
public class OrderProviderMain {
    /**
     * 启动类
     *
     * @param args 启动类
     */
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:provider.xml");
        String javaVersion = System.getProperty("java.version");
        System.out.println("javaVersion = " + javaVersion);
        System.out.println("服务端已经启动-------------------------");
        System.in.read();
    }
}
