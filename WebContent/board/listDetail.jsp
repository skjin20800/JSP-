<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp" %>

<div id="mcontainer">



	<div class="progress col-md-12 m-2">
		<div class="progress-bar" style="width: 70%"></div>
	</div>

		<div class="card col-md-12 m-2">
			<div class="card-body">
			<h4 class="card-title">${detail.id}</h4>
				<h4 class="card-title">${detail.title}</h4>
				<h4 class="card-title">${detail.content}</h4>
				<h4 class="card-title">${detail.userId}</h4>
				<h4 class="card-title">${detail.createDate}</h4>
			</div>
		</div>

	<br />
	<form action="/blog/board?cmd=back" method="POST">
	<ul class="pagination justify-content-center">
		<li class="page-item disabled">
			<button type="submit" class="btn btn-primary">뒤로가기</button></li>
		<li class="page-item"><a class="page-link" href="#">Next</a></li>
	</ul>
	</form>



 <div class="container">

</div>
</div>
<script>

</script>
</body>
</html>



