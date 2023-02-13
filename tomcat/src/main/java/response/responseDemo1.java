package response; /**
 * @author: Java_cmr
 * @Date: 2023/2/13 - 10:24
 */

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/resp1")
public class responseDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("resp1...");

//        response.setStatus(302);
//        response.setHeader("Location", "/tomcat/resp2");
        response.sendRedirect("https://www.baidu.com");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
