<%@page import="java.util.ArrayList" %>
<%@page import="com.model.UserDream" %>
<%@include file="Navbar.jsp"%>
<div class="container">
	<div class="row">
		<table class="table">
  <thead>
    <tr>
      <th>S.No</th>
      <th>Dream</th>
      <th>Achieve Date</th>
      <th>Image</th>
      <th>Delete</th>
      <th>Edit</th>
    </tr>
  </thead>
  <tbody>
  	<%
  		ArrayList<UserDream> user=(ArrayList<UserDream>)request.getAttribute("dreams");
  		for(int i=0;i<user.size();i++){
  	%>
	    <tr>
	      <td><%=i%></td>
	      <td><%=user.get(i).getDremName() %></td>
	      <td><%=user.get(i).getDate() %></td>
	      <td><img height="100" width="100" src="img\\<%=user.get(i).getImage()%>"></td>
	      <td><a href="delete?id=<%=user.get(i).getId() %>" class="btn btn-danger">Delete</a></td>
	      <td><a href="" class="btn btn-primary">Edit</a></td>
	    </tr>
	<%
  		}
  		session.removeAttribute("dreams");
	%>
  </tbody>
</table>
	</div>
</div>