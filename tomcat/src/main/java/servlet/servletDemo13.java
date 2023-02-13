package servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author: Java_cmr
 * @Date: 2023/2/12 - 17:49
 */
public class servletDemo13 implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("xmlservice");
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
