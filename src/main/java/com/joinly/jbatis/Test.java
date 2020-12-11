package com.joinly.jbatis;

import com.joinly.jbatis.mapper.SysUserMapper;

/**
 * @author joinly
 * @company: goodinvest
 * @date 2020-12-10 17:11
 * @desc: TODO
 */
public class Test {

    public static void main(String[] args) {
        SqlSession sqlSession = new SqlSession(new Configuration(), new Executor());
        SysUserMapper mapper = sqlSession.getMapper(SysUserMapper.class);
        mapper.get(2);
    }
}
