package com.update.pattern.structural.proxy.dynamic;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        People domestic = new Domestic();
        DynamicProxy proxy = new DynamicProxy(domestic);

        ClassLoader classLoader = domestic.getClass().getClassLoader();

        People oversea = (People) Proxy.newProxyInstance(classLoader, new Class[]{People.class}, proxy);
        oversea.buy();
    }
}
