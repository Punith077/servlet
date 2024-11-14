package WebServlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import WebServlet.dao.StudentDao;
import WebServlet.dto.StudentDto;

@WebServlet("/su")
public class signup extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String s1=req.getParameter("sname");
		String s2=req.getParameter("smob");
		String s3=req.getParameter("semail");
		String s4=req.getParameter("spwd");
		String s5=req.getParameter("gender");
		String s7=req.getParameter("country");
		//System.out.println(s1+" "+s2+" "+s3+" "+s4+" "+s5+" "+s7);
		
		StudentDto stu=new StudentDto();
		stu.setName(s1);
		long cmob=Long.parseLong(s2);
		stu.setMobile(cmob);
		stu.setEmail(s3);
		stu.setPasword(s4);
		stu.setGender(s5);
		stu.setCountry(s7);
		
		System.out.println(stu);
		
		StudentDao studentDao=new StudentDao();
		String msg=studentDao.insert(stu);
		
		resp.getWriter().print(msg);
	}
}
