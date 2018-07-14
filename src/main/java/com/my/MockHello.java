package com.my;

public class MockHello implements IHello{
    @Override
    public String sayHello(String s) {
        return "system busy" + s;
    }
}
