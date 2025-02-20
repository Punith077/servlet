package WebServlet.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import WebServlet.dao.StudentDao;

@WebServlet("/did")
public class DeleteById extends HttpServlet {

	@Override
	//doPost
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("pk");
		System.out.println(email);
		
		StudentDao studentDao=new StudentDao();
		String msg=studentDao.deleteById(email);
//		Object deo=studentDao.deleteById(email);
//		resp.getWriter().print(deo);
		
		List<StudentDao> obj=studentDao.fetchAll();
		req.setAttribute("key", obj);
		
		RequestDispatcher r=req.getRequestDispatcher("getAllRec.jsp");
		r.forward(req, resp);
		
	}
}
