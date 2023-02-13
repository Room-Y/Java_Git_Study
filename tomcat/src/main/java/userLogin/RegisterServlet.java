package userLogin; /**
 * @author: Java_cmr
 * @Date: 2023/2/13 - 11:40
 */

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import utils.SqlSessionFactoryUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user1 = new User();
        user1.setUsername(username);
        user1.setPassword(password);

        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();


        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.selectByUsername(username);

        response.setContentType("text/html; charset=utf-8");
        PrintWriter writer = response.getWriter();
        if(user == null){
            mapper.add(user1);
            sqlSession.commit();
            sqlSession.close();
//            writer.write("注册成功");
        }else{
            writer.write("用户名已存在");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
