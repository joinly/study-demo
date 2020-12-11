package com.joinly.pattern.cglibproxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author joinly
 * @company: goodinvest
 * @date 2020-12-09 11:31
 * @desc: 代理类
 */
public class CglibMeiPao implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     * @param o 为由CGLib动态生成的代理类实例
     * @param method 为上文中实体类所调用的被代理的方法引用
     * @param objects 为参数值列表
     * @param methodProxy 为生成的代理类对方法的代理引用
     * @return 从代理实例的方法调用返回的值。
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("-------------媒婆开始物色------------------");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("-------------找到目标,你们交往吧------------------");
        return result;
    }
}
