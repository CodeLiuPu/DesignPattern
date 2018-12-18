package com.update.pattern.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author : liupu.
 * @date : 2018/12/18
 */
public class DynamicProxy implements InvocationHandler {
    private Object obj;//被代理的对象

    public DynamicProxy(Object obj) {
        this.obj = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("海外动态代理调用方法： "+method.getName());
        Object result = method.invoke(obj, args);//调用被代理的对象的方法
        return result;
    }
}
