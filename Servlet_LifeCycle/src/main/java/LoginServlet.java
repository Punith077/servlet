import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/login")
public class LoginServlet extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1=arg0.getParameter("e");
		String s2=arg0.getParameter("p");
		
		//System.out.println(s1+"  "+s2);
		
		arg1.getWriter().print(s1);
		arg1.getWriter().print(s2);

	}
	
}
