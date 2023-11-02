import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginController", value ="/login")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String email = request.getParameter("email");
    String pass = request.getParameter("pass");
    if("tquan957@gmail.com".equals(email)&&"123456".equals(pass)){
        response.getWriter().println("Login Success");
    }else {
        request.setAttribute("error","Bạn nhập sai Email hoặc Password");
        request.getRequestDispatcher("login.jsp").forward(request,response);
    }

    }
}
