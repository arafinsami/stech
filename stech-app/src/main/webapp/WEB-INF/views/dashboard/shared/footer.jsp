<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="images" value="/resources/images" />
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<div class="footerSection">
	<div class="container">
		<div class="row footer-social">
			<div class="col-md-6">
				<div class="footer-social-icons">
					<h2>Follow us</h2>
					<ul class="socialIcon">
						<li><a href="" title=""><i class="fa fa-google-plus"></i></a></li>
						<li><a href="" title=""><i class="fa fa-facebook"></i></a></li>
						<li><a href="" title=""><i class="fa fa-linkedin"></i></a></li>
						<li><a href="" title=""><i class="fa fa-twitter"></i></a></li>
						<li><a href="" title=""><i class="fa fa-youtube"></i></a></li>
						<li><a href="" title=""><i class="fa fa-instagram"></i></a></li>
					</ul>
				</div>
			</div>
			<div class="col-md-6">
				<div class="footer-social-icons footer-download">
					<h2>Mobile app</h2>
					<ul class="socialIcon socialIconOne">
						<li><a href="" title=""><i class="fa fa-apple"></i></a></li>
						<li><a href="" title=""><i class="fa fa-android"></i></a></li>
					</ul>
				</div>
			</div>
		</div>
		<p class="footerBottom">© 2015 - 2019 Upwork® Global Inc.</p>
	</div>
</div>


<jsp:include page="/WEB-INF/views/dashboard/shared/scripts.jsp" />
    
 <script>
   $('.owl-carouseltestimonials').owlCarousel({
   	loop:true,
   	margin:10,
   	autoplay:false,
   	autoplayTimeout:5000,
   	autoplayHoverPause:false,
   	responsiveClass:true,
   	responsive:{
   		0:{
   			items:1,
   			nav:true
   		},
   		
   		1200:{
   			items:1,
   			nav:true,
   			loop:true
   		}
   	}
   })  
 </script>
 
 <script>
   $(document).ready(function() {
    // executes when HTML-Document is loaded and DOM is ready
   
   // breakpoint and up  
   $(window).resize(function(){
   	if ($(window).width() >= 980){	
   
   	  // when you hover a toggle show its dropdown menu
   	  $(".navbar .dropdown-toggle").hover(function () {
   		 $(this).parent().toggleClass("show");
   		 $(this).parent().find(".dropdown-menu").toggleClass("show"); 
   	   });
   
   		// hide the menu when the mouse leaves the dropdown
   	  $( ".navbar .dropdown-menu" ).mouseleave(function() {
   		$(this).removeClass("show");  
   	  });
   		// do something here
   	}	
   });  
   
   // document ready  
   });
 </script>
 
 <script>		
   $('.toggle').click(function() {
   	$('#target').toggle('slow');
   });
   $('.toggle1').click(function() {
   	$('#target1').toggle('slow');
   });
   $('.toggle2').click(function() {
   	$('#target2').toggle('slow');
   });
   $('.toggle3').click(function() {
   	$('#target3').toggle('slow');
   });
   $('.toggle4').click(function() {
   	$('#target4').toggle('slow');
   });
 </script>
 
 <script>
   $(".closebutton").on("click", function (event) {
   	$(this).parent().fadeOut();
   	event.preventDefault();
   });
 </script>
 
 <script>
   /* Loop through all dropdown buttons to toggle 
   between hiding and showing its dropdown 
   content - This allows the user to have multiple 
   dropdowns without any conflict */
   var dropdown = document.getElementsByClassName("dropdown-btn");
   var i;
   
   for (i = 0; i < dropdown.length; i++) {
     dropdown[i].addEventListener("click", function() {
     this.classList.toggle("active");
     var dropdownContent = this.nextElementSibling;
     if (dropdownContent.style.display === "block") {
     dropdownContent.style.display = "none";
     } else {
     dropdownContent.style.display = "block";
     }
     });
   }
 </script>

    