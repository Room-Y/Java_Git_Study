package servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @author: Java_cmr
 * @Date: 2023/2/12 - 16:29
 */
@WebServlet(value = "/demo1", loadOnStartup = 1)
public class servletDemo1 implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("serlvet hello World!");
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
