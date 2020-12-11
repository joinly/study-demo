package com.joinly.jbatis;

import java.lang.reflect.Proxy;
import java.util.ResourceBundle;

/**
 * @author joinly
 * @company: goodinvest
 * @date 2020-12-10 15:13
 * @desc: 生成代理类，解析sql
 */
public class Configuration {

    public static final ResourceBundle sqlMappings;

    static {
        sqlMappings = ResourceBundle.getBundle("sql");
    }

    public <T> T getMapper(Class clazz, SqlSession sqlSession) {
        return (T) Proxy.newProxyInstance(
                this.getClass().getClassLoader(),
                new Class[] {clazz},
                new MapperProxy(sqlSession)
        );
    }
}
