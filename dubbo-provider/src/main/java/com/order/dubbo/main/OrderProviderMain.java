package com.order.dubbo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * ��������:
 * ��Ŀ����:order-dubbo
 * ��������:2020/5/28
 *
 * @author Lenovo
 */
public class OrderProviderMain {
    /**
     * ������
     *
     * @param args ������
     */
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:provider.xml");
        String javaVersion = System.getProperty("java.version");
        System.out.println("javaVersion = " + javaVersion);
        System.out.println("������Ѿ�����-------------------------");
        System.in.read();
    }
}
