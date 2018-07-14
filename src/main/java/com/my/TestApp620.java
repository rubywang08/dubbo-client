package com.my;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class TestApp620
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-client-620.xml");
        IHello hello = (IHello) context.getBean("helloService");
        System.out.println(hello.sayHello(" ruby"));
    }
}
