package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author: Java_cmr
 * @Date: 2023/1/17 - 17:00
 * JDBC快速入门
 */
public class JDBCdemo2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //注册驱动
//        Class.forName("com.mysql.cj.jdbc.Driver");
        Class.forName("com.mysql.jdbc.Driver");

        //获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/homework1_multi_table_query?useSSL=false";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, username, password);

        //定义sql
        String sql1 = "UPDATE account set money = 300 WHERE name='张三'";
        String sql2 = "UPDATE account set money = 600 WHERE name='李四'";
        //获取执行sql的对象
        Statement statement = conn.createStatement();
        try {
            //开启事务
            conn.setAutoCommit(false);

            //执行sql,返回影响的行数
            int row1 = statement.executeUpdate(sql1);
            System.out.println(row1);
            int a = 1/0;
            //执行sql,返回影响的行数
            int row2 = statement.executeUpdate(sql2);
            System.out.println(row2);

            //提交事务
            conn.commit();
        } catch (SQLException e) {
            //回滚事务
            conn.rollback();

            throw new RuntimeException(e);
        }

        //释放资源
        statement.close();
        conn.close();
    }
}
