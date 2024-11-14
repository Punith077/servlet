package WebServlet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import WebServlet.dao.StudentDao;
import WebServlet.dto.StudentDto;

@WebServlet("/update")
public class Modify extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("sname");
		String mobile=req.getParameter("smob");
		long cmob=Long.parseLong(mobile);
		String email=req.getParameter("semail");
		String password=req.getParameter("spwd");
		String gender=req.getParameter("gender");
		String country=req.getParameter("country");
		
		//we can use type=hidden in html where it will not show email to end user
		//we can use readonly=readonly or disabled=disabled
		//System.out.println(s1+" "+s2+" "+s3+" "+s4+" "+s5+" "+s7);
		
		StudentDto dto=new StudentDto();
		dto.setEmail(email);
		dto.setName(name);
		dto.setMobile(cmob);
		dto.setGender(gender);
		dto.setPasword(password);
		dto.setCountry(country);
		
		StudentDao dao= new StudentDao();
		dao.update(dto);
		
		Object o=dao.fetchAll();
		req.setAttribute("key", o);
		RequestDispatcher dispatcher =req.getRequestDispatcher("getAllRec.jsp");
		dispatcher.forward(req, resp);
	}
}
