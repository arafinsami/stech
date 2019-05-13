
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="images" value="/resources/images" />
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<div class="col-md-3">
	<div class="leftCategory">
		<div class="sidenav">
			<button class="dropdown-btn">
				<i class="fa fa-area-chart"></i> Chart <i class="fa fa-caret-down"></i>
			</button>
			<div class="dropdown-container">
				<a href="#"><i class="fa fa-angle-right"></i> Link 1</a> <a href="#"><i
					class="fa fa-angle-right"></i> Link 2</a> <a href="#"><i
					class="fa fa-angle-right"></i> Link 3</a>
			</div>
			<a href="#"><i class="fa fa-newspaper-o"></i>News Feed</a> <a
				href="#"><i class="fa fa-comment"></i>Messenger</a> <a href="#"><i
				class="fa fa-youtube"></i>Watch</a> <a href="#"><i
				class="fa fa-user-circle"></i>User</a> <a href="#"><i
				class="fa fa-bell"></i>Notifications</a> <a href="#"><i
				class="fa fa-cubes"></i>Cubes</a> <a href="#"><i class="fa fa-users"></i>Group</a>
		</div>
	</div>
	<div class="leftCategory">
		<h4>Category</h4>
		<ul>
			<li><a href="#"><i class="fa fa-area-chart"></i>Chart</a></li>
			<li><a href="#"><i class="fa fa-bell"></i>Notifications</a></li>
			<li><a href="#"><i class="fa fa-cubes"></i>Cubes</a></li>
			<li><a href="#"><i class="fa fa-users"></i>Group</a></li>
		</ul>
		<a href="" title="" class="buttonLeft">View more</a>
	</div>
</div>