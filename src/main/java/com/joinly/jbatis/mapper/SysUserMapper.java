package com.joinly.jbatis.mapper;

import com.joinly.jbatis.entity.SysUser;
import java.util.Map;
import java.util.List;

 /**
 * @author joinly
 * @company: GoodInvest
 * @date 2020-12-10 14:37:25
 * @desc: 管理后台-账号表数据库访问层
 */
public interface SysUserMapper {

    /**
     * 分页查询
     * @param map 查询参数
     * @return 对象列表
     */
    List<SysUser> pageList(Map<String, Object> map);
    
    /**
     * @param map 查询参数
     * @return 分数总条数
     */
    Integer pageListTotal(Map<String, Object> map);

    SysUser get(Integer id);
}