import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.rmi.ServerException;

public class MyAge extends HttpServlet {



    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServerException, IOException{

        BirthDay birthDay = new BirthDay();

       long days = birthDay.getDays();
        response.getWriter().println("My age in days: "+days);
        response.getWriter().println("Ce mare sunt!?!");
    }

}
