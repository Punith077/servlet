import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class LoginWeb extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String s1=req.getParameter("e");
		String s2=req.getParameter("p");
		
		System.out.println(s1+" "+s2);
//		resp.getWriter().print(s1);
//		resp.getWriter().print(s2);
	}
}
