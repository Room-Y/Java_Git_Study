package jdbc;

import java.sql.*;

/**
 * @author: Java_cmr
 * @Date: 2023/1/17 - 17:00
 * JDBC快速入门
 */
public class JDBCdemoSQLzhuru {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //获取连接
        String url = "jdbc:mysql:///test?useSSL=false";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, username, password);

//        String name = "zhangsan";
//        String ps = "1234";
        String name = "zafwafawfafsa";
        String ps = "' or '1'= '1";

        String sql = "select * from user where username = '" + name + "' and password = '" + ps + "'";
        System.out.println(sql);
        Statement statement = conn.createStatement();
        ResultSet res = statement.executeQuery(sql);
        if(res.next()){
            System.out.println("登陆成功");
        }else{
            System.out.println("登陆失败");
        }

        //释放资源
        res.close();
        statement.close();
        conn.close();
    }
}
