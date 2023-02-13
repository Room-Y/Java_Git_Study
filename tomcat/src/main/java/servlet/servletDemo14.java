package servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: Java_cmr
 * @Date: 2023/2/12 - 18:08
 */
@WebServlet("/demo14")
public class servletDemo14 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");

        resp.setHeader("content-type", "text/html; charset=utf-8");
        resp.getWriter().write("<h1>"+ name + "，欢迎您！</h1>");
        System.out.println(req);
    }
}
