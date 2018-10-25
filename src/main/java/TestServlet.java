import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/test-servlet")
public class TestServlet  extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("username");
        String pass = req.getParameter("password");


        PrintWriter wr = resp.getWriter();

        wr.println("me hehe. your credentials are\n");

        wr.println("username: "+name);
        wr.println("password: "+pass);

        wr.println("\nthat was soooo unwise.. boo hoo ");

    }
}
