package servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "TestServlet")
public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String developer = request.getParameter("developer");
        response.setContentType("test/html; charset=UTF-8");
        response.getWriter().println("欢迎开发者" + developer);
    }


    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
//        String developer = request.getParameter("developer");
//        response.setContentType("test/html; charset=UTF-8");
//        response.getWriter().println("欢迎开发者" + developer);
    }
}
