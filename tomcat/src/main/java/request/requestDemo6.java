package request; /**
 * @author: Java_cmr
 * @Date: 2023/2/13 - 10:09
 */

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/req6")
public class requestDemo6 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Object msg = request.getAttribute("msg");
        System.out.println("demo6 + " + msg);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
