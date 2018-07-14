package com.my;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-client.xml");
        IHello hello = (IHello) context.getBean("helloService");
        System.out.println(hello.sayHello(" ruby"));
/*        IProtocol protocol = (IProtocol)context.getBean("protocolService");
        System.out.println(protocol.printProtocol("hessian"));*/
    }
}
