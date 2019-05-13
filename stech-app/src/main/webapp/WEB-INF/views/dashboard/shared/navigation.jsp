<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="images" value="/resources/images" />
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<div class="mainNavgation">
	<nav class="navbar navbar-expand-lg navbar-dark fixed-top navbarLight">
		<div class="container">
			<a class="navbar-brand js-scroll-trigger" href=""><img
				src="${images}/logo.jpg" alt=""></a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarResponsive" aria-controls="navbarResponsive"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse navright " id="navbarResponsive">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a class="nav-link" href="">Home</a></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
						role="button" data-toggle="dropdown" aria-haspopup="true"
						aria-expanded="false">See All</a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdown">
							<div class="container">
								<div class="row">
									<div class="col-md-12">
										<ul class="nav flex-column navFullWidth">
											<li class="nav-item"><a class="nav-link " href="#">Customer
													Support</a></li>
											<li class="nav-item"><a class="nav-link " href="#">All
													Categories</a></li>
											<li class="nav-item"><a class="nav-link " href="#">Customer
													Support</a></li>
											<li class="nav-item"><a class="nav-link " href="#">All
													Categories</a></li>
											<li class="nav-item"><a class="nav-link " href="#">Customer
													Support</a></li>
											<li class="nav-item"><a class="nav-link " href="#">All
													Categories</a></li>
											<li class="nav-item"><a class="nav-link " href="#">Customer
													Support</a></li>
											<li class="nav-item"><a class="nav-link " href="#">All
													Categories</a></li>
											<li class="nav-item"><a class="nav-link " href="#">Customer
													Support</a></li>
											<li class="nav-item"><a class="nav-link " href="#">All
													Categories</a></li>
											<li class="nav-item"><a class="nav-link " href="#">Customer
													Support</a></li>
											<li class="nav-item"><a class="nav-link " href="#">All
													Categories</a></li>
										</ul>
									</div>
								</div>
							</div>
						</div></li>
					<li class="nav-item"><a class="nav-link" href="">About Us</a></li>
					<li class="nav-item"><a class="nav-link" href="">Contac Us</a></li>
					<li class="nav-item"><a class="nav-link" href="">Categories</a></li>
				</ul>
				<div class="looklikeFacebook">
					<ul id="menu">
						<li><a href="" title="" class="imgText"><img
								src="${images}/thum.png" alt=""> Saiful</a></li>
						<li><input id="check02" type="checkbox" name="menu" /> <label
							for="check02"></label>
							<div class="submenu">
								<ul class="dropdownMenuRight">
									<li>
										<div class="submenuLeft">
											<h4>
												FINANCES <a href="">Manage <i
													class="fa fa-long-arrow-right"></i></a>
											</h4>
											<ul>
												<li><a href="" title="">Balances</a></li>
												<li class="leftInside"><a href="" title="">$10.05USD</a></li>
												<li><a href="" title="">Deposit Funds</a></li>
												<li><a href="" title="">Withdraw Funds</a></li>
												<li><a href="" title="">Transaction History</a></li>
												<li><a href="" title=""></a></li>
											</ul>
										</div>
									</li>
									<li class="hideborder">
										<div class="submenuLeft">
											<h4>
												ACCOUNT <a href="">Manage <i
													class="fa fa-long-arrow-right"></i></a>
											</h4>
											<ul>
												<li><a href="" title="">View Profile</a></li>
												<li><a href="" title="">Manage Membership</a></li>
												<li><a href="" title="">Discover Insights</a></li>
												<li><a href="" title="">Get Support</a></li>
												<li><a href="/logout" title="">Logout</a></li>
											</ul>
										</div>
									</li>
								</ul>
							</div></li>
					</ul>
				</div>
				<!--End looklikeFacebook-->
			</div>
		</div>
	</nav>
</div>
<!--End mainNavgation-->
<div class="postsection">
	<div class="container">
		<div class="row">
			<div class="col-md-3">
				<div class="projectLeftbox">
					<a href="#"><i class="fa fa-desktop	"></i>My ProjectS</a>
				</div>
			</div>
			<div class="col-md-9">
				<ul class="newsFeedList">
					<li><a href="#"><i class="fa fa-desktop	"></i>My Projects</a></li>
					<li><a href="#"><i class="fa fa-desktop	"></i>My Demo</a></li>
					<li><a href="#"><i class="fa fa-commenting-o"></i>Messenger</a></li>
					<li><a href="#"><i class="fa fa-bell"></i>Notifications</a></li>
					<li><a href="#"><i class="fa fa-search"></i>Browse</a></li>
					<li><a href="#"><i class="fa fa-user-circle"></i>User</a></li>
				</ul>
			</div>
		</div>
	</div>
</div>


