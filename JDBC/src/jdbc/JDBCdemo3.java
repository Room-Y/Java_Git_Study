package jdbc;

import java.sql.*;

/**
 * @author: Java_cmr
 * @Date: 2023/1/17 - 17:00
 * JDBC快速入门
 */
public class JDBCdemo3 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //注册驱动
//        Class.forName("com.mysql.cj.jdbc.Driver");
        Class.forName("com.mysql.jdbc.Driver");

        //获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/homework1_multi_table_query?useSSL=false";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, username, password);

        String sql = "Select * from account";

        Statement statement = conn.createStatement();
        ResultSet res = statement.executeQuery(sql);

        while (res.next()){
//            int anInt = res.getInt(1);
//            String string = res.getString(2);
//            double aDouble = res.getDouble(3);
            int anInt = res.getInt("id");
            String string = res.getString("name");
            double aDouble = res.getDouble("money");
            System.out.println(anInt + " " + string + " " + aDouble);
        }

        //释放资源
        res.close();
        statement.close();
        conn.close();
    }
}
