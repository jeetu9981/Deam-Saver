<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-primary bg-dark">
  <div class="container-fluid">
  <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
    <a class="navbar-brand" href="home">Home</a>
    <%
    	if(session.getAttribute("Id")==null){
    %>
        <li class="nav-item">
        	<a class="nav-link active" aria-current="page" href="Signup.jsp">Signup</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="Signin.jsp">Signin</a>
        </li>
       <%
       		}else{
       	%>
       		<li class="nav-item">
        	<a class="nav-link active" aria-current="page" href="AddDream,jsp.jsp">Add Dream</a>
	        </li>
       		<li class="nav-item">
        	<a class="nav-link active" aria-current="page" href="#">Welcome : <%=session.getAttribute("Name") %></a>
	        </li>
	        <li class="nav-item">
        	<a class="nav-link active" aria-current="page" href="logout">LogOut</a>
	        </li>
       <%
       		}
       %>
      </ul>
     
    </div>
  </div>
</nav>
</body>
</html>