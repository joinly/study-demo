package com.joinly.jbatis;

/**
 * @author joinly
 * @company: goodinvest
 * @date 2020-12-10 15:14
 * @desc: 提供查询接口
 */
public class SqlSession {

    private Configuration configuration;

    private Executor executor;

    public SqlSession(Configuration configuration, Executor executor) {
        this.configuration = configuration;
        this.executor = executor;
    }

    public <T> T get(String statementId, Object parameter) {
        String sql = Configuration.sqlMappings.getString(statementId);
        if (null != sql && !"".equals(sql)) {
            executor.get(sql, parameter);
        }
        return null;
    }

    public <T> T getMapper(Class clazz){
        return configuration.getMapper(clazz, this);
    }
}
