package MavernServlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import MavernServlet.dto.EmployeeDto;

@WebServlet("/create")
public class Insert extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//to recieve the data from front end
		String s1=req.getParameter("e");
		String s2=req.getParameter("p");
		
		//System.out.println(s1+" "+s2);
		
		//create the object for dto class and set the values
		EmployeeDto employeeDto=new EmployeeDto();
		
	}
}
