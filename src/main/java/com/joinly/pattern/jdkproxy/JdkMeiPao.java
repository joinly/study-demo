package com.joinly.pattern.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author joinly
 * @company: goodinvest
 * @date 2020-12-09 11:58
 * @desc: TODO
 */
public class JdkMeiPao implements InvocationHandler {

    private IPerson target;

    public IPerson getInstance(IPerson target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return (IPerson) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("-------------媒婆开始物色------------------");
        Object result = method.invoke(this.target, args);
        System.out.println("-------------找到目标,你们交往吧------------");
        return result;
    }
}
