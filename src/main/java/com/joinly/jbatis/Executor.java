package com.joinly.jbatis;

import com.joinly.jbatis.entity.SysUser;

import java.sql.*;

/**
 * @author joinly
 * @company: goodinvest
 * @date 2020-12-10 15:14
 * @desc: 执行器
 */
public class Executor {

    public <T> T get(String sql, Object parameter) {
        Connection conn = null;
        Statement stmt = null;
        SysUser user = new SysUser();

        try {
            // 注册 JDBC 驱动
            Class.forName("com.mysql.jdbc.Driver");

            // 打开连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bitrade", "root", "root");

            // 执行查询
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(String.format(sql, parameter));

            // 获取结果集
            while (rs.next()) {
                Integer id = rs.getInt("id");
                String username = rs.getString("username");
                String nickname = rs.getString("nickname");
                String mobile = rs.getString("mobile");
                user.setId(id);
                user.setUsername(username);
                user.setNickname(nickname);
                user.setMobile(mobile);
            }
            System.out.println(user);

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return (T)user;
    }
}
