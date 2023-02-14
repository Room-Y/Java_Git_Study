package web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
@author: Java_cmr
@Date: 2023/2/14 - 15:33
*/
@WebFilter("/*")
public class fliterDemo1 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("FliterDemo...");

        filterChain.doFilter(servletRequest, servletResponse);

        System.out.println("After FliterDemo...");
    }

    @Override
    public void destroy() {

    }
}
