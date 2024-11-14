<%@page import="java.util.List"%>
<%@page import="WebServlet.dto.StudentDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% List<StudentDto> l=(List<StudentDto>) request.getAttribute("key"); %>
<table border>
<tr>
	<th>Email</th> 
	<th>Country</th> 
	<th>Gender</th> 
	<th>Name</th> 
	<th>Password</th> 
	<th>Phone no</th>
	<th>Delete</th>
	<th>Update</th>
</tr>
<% for(StudentDto s:l){%>
<tr>
 <td><%=s.getEmail() %></td>
 <td><%=s.getCountry() %></td>
 <td><%=s.getGender() %></td>
 <td><%=s.getName() %></td>
 <td><%=s.getPasword() %></td>
 <td><%=s.getMobile() %></td>
 <td><a href="did?pk=<%=s.getEmail() %>" >delete</a></td>
 <td><a href="update.jsp?email=<%=s.getEmail() %>&&name=<%=s.getName() %>&&mobile=<%=s.getMobile() %>&&password=<%=s.getPasword() %>&&gender=<%=s.getGender() %>&&country=<%=s.getCountry() %>" >edit</a></td> 
</tr>
<% }%>
</table>
</body>
</html>