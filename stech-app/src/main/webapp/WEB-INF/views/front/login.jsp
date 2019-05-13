<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>::upwork::</title>
	<jsp:include page="/WEB-INF/views/front/shared/css.jsp" />
</head>
  
<body id="page-top">
 
	<jsp:include page="/WEB-INF/views/front/shared/navigation.jsp" />
	
	<div class="loginSection">
		<div class="container">
			<div class="createAccountSection">
				<div class="mainFormsection">
					<h3>Login</h3>
					<div class="architectForm">
						<div class="architectForm">	
							<form action="${contextPath}/perform_login" method="POST" role="form" class="registration-form">
								<fieldset>
									<div class="form-bottom">											
										<div class="fieldOne">
										    <input class="form-control" name="username" value="${login.username}" 
										    placeholder="User Name" type="text" />
									   </div>
										<div class="fieldOne">
										    <input class="form-control" name="password" 
										    value="${login.password}" placeholder="Password" type="password" />
										</div>											
										<button type="submit" class="btn submitbtn">Submit</button>
									</div>
								</fieldset>	
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>		
	</div>

<jsp:include page="/WEB-INF/views/front/shared/scripts.jsp" />

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
	$(function() {
		var $divs = $('#architect > div');
		$divs.first().show()
		$('.topRadio').on('change',function() {
			  $divs.hide();
			  $divs.eq( $('.topRadio').index( this ) ).show();
		});
	});
	$(function() {
		var $divs = $('.architectForm > .architectForm2');
		$divs.first().show()
		$('.topRadio1').on('change',function() {
			  $divs.hide();
			  $divs.eq( $('.topRadio1').index( this ) ).show();
		});
	});
</script>
<script>

	$(document).ready(function () {
		$('.registration-form fieldset:first-child').fadeIn('slow');
	
		$('.registration-form input[type="text"]').on('focus', function () {
			$(this).removeClass('input-error');
		});
	
		// next step
		$('.registration-form .btn-next').on('click', function () {
			var parent_fieldset = $(this).parents('fieldset');
			var next_step = true;
	
			parent_fieldset.find('input[type="text"],input[type="password"],input[type="email"]').each(function () {
				if ($(this).val() == "") {
					$(this).addClass('input-error');
					next_step = false;
				} else {
					$(this).removeClass('input-error');
				}
			});
	
			if (next_step) {
				parent_fieldset.fadeOut(400, function () {
					$(this).next().fadeIn();
				});
			}
	
		});
	
		// previous step
		$('.registration-form .btn-previous').on('click', function () {
			$(this).parents('fieldset').fadeOut(400, function () {
				$(this).prev().fadeIn();
			});
		});
	
		// submit
		$('.registration-form').on('submit', function (e) {
	
			$(this).find('input[type="text"],input[type="email"]').each(function () {
				if ($(this).val() == "") {
					e.preventDefault();
					$(this).addClass('input-error');
				} else {
					$(this).removeClass('input-error');
				}
			});
	
		});
	
	   
	});

</script>


<script>				
	$(document).ready(function() {
	  $("#toggle").click(function() {
		var elem = $("#toggle").text();
		if (elem == "View More") {
		  //Stuff to do when btn is in the read more state
		  $("#toggle").text("View Less");
		  $("#text").slideDown();
		} else {
		  //Stuff to do when btn is in the read less state
		  $("#toggle").text("View More");
		  $("#text").slideUp();
		}
	  });
	});
	
	$(document).ready(function() {
	  $("#toggle1").click(function() {
		var elem = $("#toggle1").text();
		if (elem == "View More") {
		  //Stuff to do when btn is in the read more state
		  $("#toggle1").text("View Less");
		  $("#text1").slideDown();
		} else {
		  //Stuff to do when btn is in the read less state
		  $("#toggle1").text("View More");
		  $("#text1").slideUp();
		}
	  });
	});
	
	$(document).ready(function() {
	  $("#toggle2").click(function() {
		var elem = $("#toggle2").text();
		if (elem == "View More") {
		  //Stuff to do when btn is in the read more state
		  $("#toggle2").text("View Less");
		  $("#text2").slideDown();
		} else {
		  //Stuff to do when btn is in the read less state
		  $("#toggle2").text("View More");
		  $("#text2").slideUp();
		}
	  });
	});
	
	$(document).ready(function() {
	  $("#toggle3").click(function() {
		var elem = $("#toggle3").text();
		if (elem == "View More") {
		  //Stuff to do when btn is in the read more state
		  $("#toggle3").text("View Less");
		  $("#text3").slideDown();
		} else {
		  //Stuff to do when btn is in the read less state
		  $("#toggle3").text("View More");
		  $("#text3").slideUp();
		}
	  });
	});
	
	$(document).ready(function() {
	  $("#toggle4").click(function() {
		var elem = $("#toggle4").text();
		if (elem == "View More") {
		  //Stuff to do when btn is in the read more state
		  $("#toggle4").text("View Less");
		  $("#text4").slideDown();
		} else {
		  //Stuff to do when btn is in the read less state
		  $("#toggle4").text("View More");
		  $("#text4").slideUp();
		}
	  });
	});
</script>



 </body>

</html>
    