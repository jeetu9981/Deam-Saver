<%-- <%@include file="Navbar.jsp"%> --%>
<%@include file="Navbar.jsp"%>

<div class="container mt-5">
	<div container="row">
		<h1 class="text-center">Registration Form</h1>
		<div class="col-md-12 mt-5">
			<form action="signup" method="post">
				<div class="mb-3">
				    <label for="exampleInputEmail1" class="form-label">User Name</label>
				    <input type="name" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required=true name="name">
			  	</div>
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

