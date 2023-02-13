package request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @author: Java_cmr
 * @Date: 2023/2/12 - 18:36
 */
@WebServlet("/requestdemo1")
public class requestDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("requestGet...");

        Map<String, String[]> parameterMap = req.getParameterMap();
        for(String key : parameterMap.keySet()){
            System.out.print(key + ":");

            String[] strings = parameterMap.get(key);
            for(String value : strings){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
