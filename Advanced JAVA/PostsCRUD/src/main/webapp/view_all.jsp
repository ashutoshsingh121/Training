<%@page import="model.Post"%>
<%@page import="java.util.List"%>
<%@page import="dao.PostDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View Post</title>

<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}

table {
	border-collapse: collapse;
	width: 30%;
}

th, td {
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: gainsboro;
}
</style>

</head>
<body>
<%
	if(request.getSession(false).getAttribute("loginStatus") == null)
		response.sendRedirect("http://localhost:8080/PostsCRUD/login.jsp");
%>
	<%
		PostDAOImpl impl = new PostDAOImpl();
		List<Post> list = impl.view();
	%>
<input type="hidden" name="o" value="12">
	<table>
		<tr>
			<th>ID</th>
			<th>TITLE</th>
			<th>BODY</th>
			<th></th>
		</tr>

		<% 
			for (Post post : list) {
		%>
		<tr>
			<td><%=post.getId()%></td>
			<td><%=post.getTitle()%></td>
			<td><%=post.getBody()%></td>
			<td><a href="http://localhost:8080/PostsCRUD/ControllerServlet?id=<%= post.getId() %>&buttonName=delete&origin=view">x</a></td>
		</tr>
		<%
			}
		%>
	</table>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>