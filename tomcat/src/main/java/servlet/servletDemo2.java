package servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @author: Java_cmr
 * @Date: 2023/2/12 - 17:15
 */
@WebServlet(value = "/demo2", loadOnStartup = 0)
public class servletDemo2 implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init");
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service");
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {
        System.out.println("destory");
    }
}
