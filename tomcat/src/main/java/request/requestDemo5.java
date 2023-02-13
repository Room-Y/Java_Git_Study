package request; /**
 * @author: Java_cmr
 * @Date: 2023/2/13 - 10:09
 */

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/req5")
public class requestDemo5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("demo5");

        //请求转发
        request.setAttribute("msg", "hello");

        request.getRequestDispatcher("/req6").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
