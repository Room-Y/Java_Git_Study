package test;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @author: Java_cmr
 * @Date: 2023/2/8 - 18:31
 */
public class testDemo1 {
    public static void main(String[] args) throws Exception {
//        selectAll();
//        addElem();
//        updateElem();
        deleteElem();
    }



    public static void selectAll() throws Exception {
        Properties prop = new Properties();
        prop.load(new FileInputStream("JDBC/src/test/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        Connection conn = dataSource.getConnection();

        String sql = "Select * from tb_brand";

        PreparedStatement pstmt = conn.prepareStatement(sql);

        //设置参数

        //执行sql
        ResultSet rs = pstmt.executeQuery();

        List<Brand> brands = new ArrayList<>();
        while(rs.next()){
            int id = rs.getInt("id");
            String brandName = rs.getString("brand_name");
            String companyName = rs.getString("company_name");
            int ordered = rs.getInt("ordered");
            String description = rs.getString("description");
            int status = rs.getInt("status");

            Brand brand = new Brand(id, brandName, companyName, ordered, description, status);
            brands.add(brand);
        }

        System.out.println(brands);

        //释放资源
        rs.close();
        pstmt.close();
        conn.close();
    }

    public static void addElem() throws Exception {
        String brandName = "香飘飘";
        String companyName = "香飘飘";
        int ordered = 1;
        String description = "绕地球一圈";
        int status = 1;


        Properties prop = new Properties();
        prop.load(new FileInputStream("JDBC/src/test/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        Connection conn = dataSource.getConnection();

        String sql = "insert into tb_brand (brand_name, company_name, ordered, description, status) values(?,?,?,?,?)";

        PreparedStatement pstmt = conn.prepareStatement(sql);

        //设置参数
        pstmt.setString(1, brandName);
        pstmt.setString(2, companyName);
        pstmt.setInt(3, ordered);
        pstmt.setString(4, description);
        pstmt.setInt(5, status);
        //执行sql
        int i = pstmt.executeUpdate();

        System.out.println(i);

        pstmt.close();
        conn.close();
    }

    public static void updateElem() throws Exception {
        String brandName = "香飘飘";
        String companyName = "香飘飘";
        int ordered = 1000;
        String description = "绕地球三圈";
        int status = 1;
        int id = 4;


        Properties prop = new Properties();
        prop.load(new FileInputStream("JDBC/src/test/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        Connection conn = dataSource.getConnection();

        String sql = "Update tb_brand set brand_name=?, company_name=?, ordered=?, description=?, status=? WHERE id = ?";

        PreparedStatement pstmt = conn.prepareStatement(sql);

        //设置参数
        pstmt.setString(1, brandName);
        pstmt.setString(2, companyName);
        pstmt.setInt(3, ordered);
        pstmt.setString(4, description);
        pstmt.setInt(5, status);
        pstmt.setInt(6, id);
        //执行sql
        int i = pstmt.executeUpdate();

        System.out.println(i);

        pstmt.close();
        conn.close();
    }

    public static void deleteElem() throws Exception {
        int id = 4;


        Properties prop = new Properties();
        prop.load(new FileInputStream("JDBC/src/test/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        Connection conn = dataSource.getConnection();

        String sql = "delete from tb_brand WHERE id = ?";

        PreparedStatement pstmt = conn.prepareStatement(sql);

        //设置参数
        pstmt.setInt(1, id);
        //执行sql
        int i = pstmt.executeUpdate();

        System.out.println(i);

        pstmt.close();
        conn.close();
    }
}
