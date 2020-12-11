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
public class JdkMeiPao2 implements InvocationHandler {

    public IPerson getInstance(Class clazz) {
        return (IPerson) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[] {clazz} , this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("-------------开始测试------------------");
        System.out.println("=================生成接口的代理类、在这里可以实现业务逻辑==========================");
        System.out.println("-------------结束测试------------");
        return null;
    }
}
