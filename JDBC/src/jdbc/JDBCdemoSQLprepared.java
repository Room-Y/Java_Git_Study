package jdbc;

import javax.lang.model.element.Name;
import java.sql.*;

/**
 * @author: Java_cmr
 * @Date: 2023/1/17 - 17:00
 * JDBC快速入门
 */
public class JDBCdemoSQLprepared {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //获取连接
        String url = "jdbc:mysql:///test?useSSL=false";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, username, password);
        String name = "zhangsan";
        String ps = "123";
        String sql = "select * from user where username = ? and password = ?";

        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1, name);
        pstm.setString(2, ps);

        ResultSet res = pstm.executeQuery();

        if(res.next()){
            System.out.println("登陆成功");
        }else{
            System.out.println("登陆失败");
        }

        //释放资源
        res.close();
        pstm.close();
        conn.close();
    }
}
