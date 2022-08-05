<%-- <%@include file="Navbar.jsp"%> --%>
<%@include file="Navbar.jsp"%>

<div class="container mt-5">
	<div container="row">
		<h1 class="text-center">Add Dream</h1>
		<div class="col-md-12 mt-5">
			<form action="addDream" method="post" enctype = "multipart/form-data">
			  <div class="mb-3">
			    <label for="exampleInputEmail1" class="form-label">Dream NAme</label>
			    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required=true name="dreamName">
			  </div>
			  <div class="mb-3">
			    <label for="exampleInputPassword1" class="form-label">Achieve Date</label>
			    <input type="date" class="form-control" id="exampleInputPassword1" required=true name="date">
			  </div>
			  
			  <div class="mb-3">
			    <label for="exampleInputPassword1" class="form-label">Dream Image</label>
			    <input type="file" class="form-control" id="exampleInputPassword1" name="image">
			  </div>
			  <button type="submit" class="btn btn-primary">Submit</button>
			</form>
		</div>
	</div>
</div>

