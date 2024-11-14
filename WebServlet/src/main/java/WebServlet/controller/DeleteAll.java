package WebServlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import WebServlet.dao.StudentDao;

@WebServlet("/da")
public class DeleteAll extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentDao da=new StudentDao();
		Object msg=da.DeleteAll();
		resp.getWriter().print(msg);
	}
}
