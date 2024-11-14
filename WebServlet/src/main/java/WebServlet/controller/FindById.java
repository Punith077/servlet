package WebServlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import WebServlet.dao.StudentDao;

@WebServlet("/fid")
public class FindById extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("pk");
		System.out.println(email);
		
		StudentDao studentDao=new StudentDao();
		Object fo=studentDao.findById(email);
		resp.getWriter().print(fo);
	}
}
