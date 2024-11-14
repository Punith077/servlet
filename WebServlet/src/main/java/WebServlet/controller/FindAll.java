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
import WebServlet.dto.StudentDto;

@WebServlet("/fa")
public class FindAll extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		StudentDao dao=new StudentDao();
		//Object o=dao.fetchAll();
//		resp.getWriter().print(o);
		List<StudentDto> o=dao.fetchAll();
		
		req.setAttribute("key", o);
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("getAllRec.jsp");
		requestDispatcher.forward(req, resp);
	}
}
