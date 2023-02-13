package response; /**
 * @author: Java_cmr
 * @Date: 2023/2/13 - 10:24
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/resp3")
public class responseDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //response.setHeader("content-type", "text/html");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.write("你好");
        writer.write("<h1>aaaa</h1>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
