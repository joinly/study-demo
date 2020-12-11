package com.joinly.jbatis;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author joinly
 * @company: goodinvest
 * @date 2020-12-10 15:15
 * @desc: 代理类
 */
public class MapperProxy implements InvocationHandler {

    private SqlSession sqlSession;

    public MapperProxy(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String mapperInterface = method.getDeclaringClass().getName();
        String methodName = method.getName();
        String statementId = mapperInterface + "." + methodName;
        return sqlSession.get(statementId, args[0]);
    }
}
