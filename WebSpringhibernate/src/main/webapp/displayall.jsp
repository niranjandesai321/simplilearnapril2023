<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page import="com.example.*" %>
    <%@ page import="java.util.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<Student> s=(List<Student>)request.getAttribute("list"); %>

<table border="1">
<tr><th>sid</th><th>semail</th><th>sphono</th></tr>
<%for(Student ss:s) {%>

<tr><td><%=ss.getSid() %></td><td><%=ss.getEmail() %></td><td><%=ss.getPhono() %></td></tr>
<%} %>
</table>
</body>
</html>
