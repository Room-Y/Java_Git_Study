package response; /**
 * @author: Java_cmr
 * @Date: 2023/2/13 - 10:24
 */

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/resp4")
public class responseDemo4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FileInputStream fis = new FileInputStream("./src/main/resources/Desert.jpg");
        ServletOutputStream outputStream = response.getOutputStream();

        IOUtils.copy(fis, outputStream);
        fis.close();

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
