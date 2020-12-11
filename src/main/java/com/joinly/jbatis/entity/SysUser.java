package com.joinly.jbatis.entity;

import java.util.Date;
import lombok.Data;

 /**
 * @author joinly
 * @company: GoodInvest
 * @date 2020-12-10 14:37:24
 * @desc: 管理后台-账号表实体类
 */
@Data
public class SysUser {

        /**主键*/
        private Integer id;
        /**登陆名*/
        private String username;
        /**登录密码*/
        private String password;
        /**昵称*/
        private String nickname;
        /**手机号*/
        private String mobile;
        /**邮箱地址*/
        private String email;
        /**生日*/
        private String birthday;
        /**性别*/
        private Integer gender;
        /**头像地址*/
        private String avatar;
        /**最近登录IP*/
        private String lastLoginIp;
        /**最近登录时间*/
        private Date lastLoginTime;
        /**登录次数*/
        private Integer loginCount;
        /**用户备注*/
        private String remark;
        /**用户状态*/
        private Integer status;
        /**注册时间*/
        private Date createTime;
        /**更新时间*/
        private Date updateTime;

         @Override
         public String toString() {
                 return "SysUser{" +
                         "id=" + id +
                         ", username='" + username + '\'' +
                         ", password='" + password + '\'' +
                         ", nickname='" + nickname + '\'' +
                         ", mobile='" + mobile + '\'' +
                         ", email='" + email + '\'' +
                         '}';
         }
 }