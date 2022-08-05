<%-- <%@include file="Navbar.jsp"%> --%>
<%@include file="Navbar.jsp"%>

<div class="container mt-5">
	<div container="row">
		<h1 class="text-center">Login Form</h1>
		<div class="col-md-12 mt-5">
			<form action="signin" method="post">
			  <div class="mb-3">
			    <label for="exampleInputEmail1" class="form-label">Email address</label>
			    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required=true name="email">
			  </div>
			  <div class="mb-3">
			    <label for="exampleInputPassword1" class="form-label">Password</label>
			    <input type="password" class="form-control" id="exampleInputPassword1" required=true name="password">
			  </div>
			  <button type="submit" class="btn btn-primary">Submit</button>
			</form>
		</div>
	</div>
</div>

