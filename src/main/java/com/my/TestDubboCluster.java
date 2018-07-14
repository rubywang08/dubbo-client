package com.my;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDubboCluster {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-client.xml");
        for (int i = 0; i < 10; i++) {
            IHello hello = (IHello) context.getBean("helloService");
            System.out.println(hello.sayHello(" ruby"));

        }
    }
}
