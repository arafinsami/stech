<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="images" value="/resources/images" />
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<div class="mainNavgation">
	<!-- Navigation -->
	<nav class="navbar navbar-expand-lg navbar-dark fixed-top navbarLight"
		id="mainNav">
		<div class="container">
			<a class="navbar-brand js-scroll-trigger" href="#page-top"><img
				src="${images}/logo.jpg" alt=""></a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarResponsive" aria-controls="navbarResponsive"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse navright " id="navbarResponsive">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a class="nav-link" href="">How it
							works</a></li>
					<li class="nav-item"><a class="nav-link"
						href="${contextPath}/auth/login">Log In</a></li>
					<li class="nav-item"><a class="nav-link" href="">Sign up</a></li>
					<li class="nav-item formobileHide"><a class="nav-link postBtn"
						href="">Post a Job</a></li>
					<li class="nav-item dropdown formobileShow"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false">See All Categories</a>
						<div class="dropdown-menu mobileHeight"
							aria-labelledby="navbarDropdown">
							<div class="container">
								<div class="row">
									<div class="col-md-12">
										<ul class="nav flex-column">
											<li class="nav-item"><a class="nav-link " href="#">Active</a></li>
											<li class="nav-item"><a class="nav-link" href="#">Link
													item</a></li>
											<li class="nav-item"><a class="nav-link" href="#">Link
													item</a></li>
										</ul>
									</div>
									<!-- /.col-md-4  -->
									<div class="col-md-12">
										<ul class="nav flex-column ">
											<li class="nav-item"><a class="nav-link " href="#">Active</a></li>
											<li class="nav-item"><a class="nav-link" href="#">Link
													item</a></li>
											<li class="nav-item"><a class="nav-link" href="#">Link
													item</a></li>
											<li class="nav-item"><a class="nav-link " href="#">Active</a></li>
											<li class="nav-item"><a class="nav-link" href="#">Link
													item</a></li>
											<li class="nav-item"><a class="nav-link" href="#">Link
													item</a></li>
											<li class="nav-item"><a class="nav-link " href="#">Active</a></li>
											<li class="nav-item"><a class="nav-link" href="#">Link
													item</a></li>
											<li class="nav-item"><a class="nav-link" href="#">Link
													item</a></li>
											<li class="nav-item"><a class="nav-link " href="#">Active</a></li>
											<li class="nav-item"><a class="nav-link" href="#">Link
													item</a></li>
											<li class="nav-item"><a class="nav-link" href="#">Link
													item</a></li>
										</ul>
									</div>
									<!-- /.col-md-4  -->
									<!-- /.col-md-4  -->
								</div>
							</div>
							<!-- /.container  -->
						</div></li>
					<li class="nav-item formobileShow"><a class="nav-link" href="">About
							us</a></li>
					<li class="nav-item formobileShow"><a class="nav-link" href="">Contact
							us</a></li>
					<li class="nav-item formobileShow"><a class="nav-link" href="">Careers</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="secondnavbar">
		<div class="container">
			<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav mr-auto">
						<li class="nav-item"><a class="nav-link" href="#">Web Dev</a></li>
						<li class="nav-item"><a class="nav-link" href="#">Mobile
								Dev</a></li>
						<li class="nav-item"><a class="nav-link" href="#">Design</a></li>
						<li class="nav-item"><a class="nav-link" href="#">Writing</a></li>
						<li class="nav-item"><a class="nav-link" href="#">Admin
								Support</a></li>
						<li class="nav-item"><a class="nav-link" href="#">Customer
								Service</a></li>
						<li class="nav-item"><a class="nav-link" href="#">Marketing</a></li>
						<li class="nav-item"><a class="nav-link" href="#">Accounting</a></li>
						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false">See All Categories</a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdown">
								<div class="container">
									<div class="row">
										<div class="col-md-12">
											<ul class="nav flex-column navFullWidth">
												<li class="nav-item"><a class="nav-link active"
													href="#">Active</a></li>
												<li class="nav-item"><a class="nav-link active"
													href="#">Active</a></li>
												<li class="nav-item"><a class="nav-link active"
													href="#">Active</a></li>
												<li class="nav-item"><a class="nav-link active"
													href="#">Active</a></li>
												<li class="nav-item"><a class="nav-link active"
													href="#">Active</a></li>
												<li class="nav-item"><a class="nav-link active"
													href="#">Active</a></li>
												<li class="nav-item"><a class="nav-link active"
													href="#">Active</a></li>
												<li class="nav-item"><a class="nav-link active"
													href="#">Active</a></li>
												<li class="nav-item"><a class="nav-link active"
													href="#">Active</a></li>
												<li class="nav-item"><a class="nav-link active"
													href="#">Active</a></li>
												<li class="nav-item"><a class="nav-link active"
													href="#">Active</a></li>
												<li class="nav-item"><a class="nav-link active"
													href="#">Active</a></li>
											</ul>
										</div>
										<!-- /.col-md-4  -->
									</div>
								</div>
								<!-- /.container  -->
							</div></li>
					</ul>
				</div>
			</nav>
		</div>
	</div>
</div>