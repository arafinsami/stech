<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="images" value="/resources/images" />
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>::upwork::</title>
    
    <jsp:include page="/WEB-INF/views/dashboard/shared/css.jsp" />
    
  </head>
  <body>
    
    <jsp:include page="/WEB-INF/views/dashboard/shared/navigation.jsp" />
    
    <div class="mainContainer">
      <div class="container">
        <div class="row">
        
          <jsp:include page="/WEB-INF/views/dashboard/shared/leftsidebar.jsp" />
          
          <div class="col-md-9">
            <div class="middleRightContent">
              <form action="#" class="searchForm">
                <div class="searchBtn"><label>Keywords</label><input class="form-control" placeholder="Find jobs with keywords" type="text" ></div>
                <div class="searchBtn"><label>Skill</label><input class="form-control" placeholder="Find the job" type="text" ></div>
                <div class="searchBtn">
                  <label>Category</label>
                  <div class="selectbtn">
                    <select name="slct">
                      <option value="1">Number of upwork</option>
                      <option value="2">Number of upwork</option>
                      <option value="3">Number of upwork</option>
                      <option value="4">Number of upwork</option>
                    </select>
                  </div>
                </div>
                <div class="searchBtn">
                  <label>Bid</label>
                  <div class="selectbtn">
                    <select name="slct">
                      <option value="1">Number of upwork</option>
                      <option value="2">Number of upwork</option>
                      <option value="3">Number of upwork</option>
                      <option value="4">Number of upwork</option>
                    </select>
                  </div>
                </div>
                <div class="searchBtn">
                  <label>Location</label>
                  <div class="selectbtn">
                    <select name="slct">
                      <option value="1">Number of upwork</option>
                      <option value="2">Number of upwork</option>
                      <option value="3">Number of upwork</option>
                      <option value="4">Number of upwork</option>
                    </select>
                  </div>
                </div>
                <div class="searchBtn budget">
                  <label>Budget</label>
                  <input class="form-control" placeholder="0" type="text" >
                  <span>-</span>
                  <input class="form-control" placeholder="2000" type="text" >
                </div>
                <div class="button-inform"><button class="submit-button">Submit</button></div>
              </form>
            </div>
            
            
            <div id="target">
            
            
              <div class="individualBox">
                <div class="imgleft"><img src="${images}/img.jpg" alt=""></div>
                <div class="contentRight">
                  <div class="headlineTop">
                    <h2 class="toggle1"><span>3-Star Hotel</span>DoubleTree by Hilton Hotel </h2>
                    <p class="toggle1"><i class="fa fa-map-marker"></i> Boston, 0.9 miles to Quincy Market <i class="fa fa-angle-down"></i></p>
                    <div class="toggle1 reviewText">
                      <p><b>Very good</b> (3458 reviews) <i class="fa fa-angle-down"></i> </p>
                      <p>Excellent location Extremely clean</p>
                    </div>
                  </div>
                  <div class="priceContent">
                    <ul>
                      <li><a href="" title=""><strong>$138</strong>Doubletree</a></li>
                      <li><a href="" title=""><strong>$138</strong>Booking.com</a></li>
                      <li><a href="" title=""><strong>$137</strong>Hotels.com</a></li>
                      <li><a href="" title=""><strong>More deals from ‎$137</strong> -20%  <i class="fa fa-angle-down"></i></a></li>
                    </ul>
                  </div>
                  <div class="detailsContent">
                    <p><a href="" title="">Flixhotels <strong> $173 </strong></a></p>
                    <p class="justColor"><a href="" title="">Doubletree <strong>$139</strong></a></p>
                    <a class="deal-button" href="">View Deal<i class="fa fa-angle-down"></i></a>								  
                  </div>
                </div>
                <div id="target1" class="targetContent">
                  <a href="" class="closebutton"><i class="fa fa-times"></i></a>  
                  <nav>
                    <div class="nav nav-tabs nav-fill" role="tablist">
                      <a class="nav-item nav-link active" id="nav-home-tab" data-toggle="tab" href="#nav-home" role="tab" aria-controls="nav-home" aria-selected="true">Info</a>
                      <a class="nav-item nav-link" id="nav-profile-tab" data-toggle="tab" href="#nav-profile" role="tab" aria-controls="nav-profile" aria-selected="false">Photos</a>
                      <a class="nav-item nav-link" id="nav-contact-tab" data-toggle="tab" href="#nav-contact" role="tab" aria-controls="nav-contact" aria-selected="false">Reviews</a>
                      <a class="nav-item nav-link" id="nav-about-tab" data-toggle="tab" href="#nav-about" role="tab" aria-controls="nav-about" aria-selected="false">Deals</a>										
                    </div>
                  </nav>
                  <div class="tab-content py-3 px-3 px-sm-0" id="nav-tabContent">
                    <div class="tab-pane fade show active" id="nav-home" role="tabpanel" aria-labelledby="nav-home-tab">
                      <div class="mapBox">
                        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2948.6977158188183!2d-71.066404184252!3d42.34896774379401!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x89e37a772cf80041%3A0x7d38d0db011cb321!2s821+Washington+St%2C+Boston%2C+MA+02111%2C+USA!5e0!3m2!1sen!2sbd!4v1550578542571" width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>
                      </div>
                    </div>
                    <div class="tab-pane fade" id="nav-profile" role="tabpanel" aria-labelledby="nav-profile-tab">
                      <ul class="owl-carouseltestimonials">
                        <li><img src="${images}/hotelPic10.jpg" alt=""></li>
                        <li><img src="${images}/hotelPic10.jpg" alt=""></li>
                        <li><img src="${images}/hotelPic10.jpg" alt=""></li>
                        <li><img src="${images}/hotelPic10.jpg" alt=""></li>
                        <li><img src="${images}/hotelPic10.jpg" alt=""></li>
                      </ul>
                      <!--banner Section-->
                    </div>
                    <div class="tab-pane fade" id="nav-contact" role="tabpanel" aria-labelledby="nav-contact-tab">
                      Et et consectetur ipsum labore excepteur est proident excepteur ad velit occaecat qui minim occaecat veniam. Fugiat veniam incididunt anim aliqua enim pariatur veniam sunt est aute sit dolor anim. Velit non irure adipisicing aliqua ullamco irure incididunt irure non esse consectetur nostrud minim non minim occaecat. Amet duis do nisi duis veniam non est eiusmod tempor incididunt tempor dolor ipsum in qui sit. Exercitation mollit sit culpa nisi culpa non adipisicing reprehenderit do dolore. Duis reprehenderit occaecat anim ullamco ad duis occaecat ex.										
                    </div>
                    <div class="tab-pane fade" id="nav-about" role="tabpanel" aria-labelledby="nav-about-tab">
                      Amet duis do nisi duis veniam non est eiusmod tempor incididunt tempor dolor ipsum in qui sit. Exercitation mollit sit culpa nisi culpa non adipisicing reprehenderit do dolore. Duis reprehenderit occaecat anim ullamco ad duis occaecat ex. Amet duis do nisi duis veniam non est eiusmod tempor incididunt tempor dolor ipsum in qui sit. Exercitation mollit sit culpa nisi culpa non adipisicing reprehenderit do dolore. Duis reprehenderit occaecat anim ullamco ad duis occaecat ex.										
                    </div>
                  </div>
                </div>
              </div>
              <!--End individualBox-->	
              
              
              
              <div class="individualBox">
                <div class="imgleft"><img src="${images}/img.jpg" alt=""></div>
                <div class="contentRight">
                  <div class="headlineTop">
                    <h2 class="toggle2"><span>3-Star Hotel</span>DoubleTree by Hilton Hotel </h2>
                    <p class="toggle2"><i class="fa fa-map-marker"></i> Boston, 0.9 miles to Quincy Market <i class="fa fa-angle-down"></i></p>
                    <div class="toggle2 reviewText">
                      <p><b>Very good</b> (3458 reviews) <i class="fa fa-angle-down"></i> </p>
                      <p>Excellent location Extremely clean</p>
                    </div>
                  </div>
                  <div class="priceContent">
                    <ul>
                      <li><a href="" title=""><strong>$138</strong>Doubletree</a></li>
                      <li><a href="" title=""><strong>$138</strong>Booking.com</a></li>
                      <li><a href="" title=""><strong>$137</strong>Hotels.com</a></li>
                      <li><a href="" title=""><strong>More deals from ‎$137</strong> -20%  <i class="fa fa-angle-down"></i></a></li>
                    </ul>
                  </div>
                  <div class="detailsContent">
                    <p><a href="" title="">Flixhotels <strong> $173 </strong></a></p>
                    <p class="justColor"><a href="" title="">Doubletree <strong>$139</strong></a></p>
                    <a class="deal-button" href="">View Deal<i class="fa fa-angle-down"></i></a>								  
                  </div>
                </div>
                <div id="target2" class="targetContent">
                  <a href="" class="closebutton"><i class="fa fa-times"></i></a>  
                  <nav>
                    <div class="nav nav-tabs nav-fill" role="tablist">
                      <a class="nav-item nav-link active" id="nav-home-tab1" data-toggle="tab" href="#nav-home1" role="tab" aria-controls="nav-home" aria-selected="true">Info</a>
                      <a class="nav-item nav-link" id="nav-profile-tab1" data-toggle="tab" href="#nav-profile1" role="tab" aria-controls="nav-profile" aria-selected="false">Photos</a>
                      <a class="nav-item nav-link" id="nav-contact-tab1" data-toggle="tab" href="#nav-contact1" role="tab" aria-controls="nav-contact" aria-selected="false">Reviews</a>
                      <a class="nav-item nav-link" id="nav-about-tab1" data-toggle="tab" href="#nav-about1" role="tab" aria-controls="nav-about" aria-selected="false">Deals</a>										
                    </div>
                  </nav>
                  <div class="tab-content py-3 px-3 px-sm-0" id="nav-tabContent1">
                    <div class="tab-pane fade show active" id="nav-home1" role="tabpanel" aria-labelledby="nav-home-tab1">
                      <div class="mapBox">
                        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2948.6977158188183!2d-71.066404184252!3d42.34896774379401!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x89e37a772cf80041%3A0x7d38d0db011cb321!2s821+Washington+St%2C+Boston%2C+MA+02111%2C+USA!5e0!3m2!1sen!2sbd!4v1550578542571" width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>
                      </div>
                    </div>
                    <div class="tab-pane fade" id="nav-profile1" role="tabpanel" aria-labelledby="nav-profile-tab1">
                      <ul class="owl-carouseltestimonials">
                        <li><img src="${images}/hotelPic1.jpg" alt=""></li>
                        <li><img src="${images}/hotelPic1.jpg" alt=""></li>
                        <li><img src="${images}/hotelPic1.jpg" alt=""></li>
                        <li><img src="${images}/hotelPic1.jpg" alt=""></li>
                        <li><img src="${images}/hotelPic1.jpg" alt=""></li>
                      </ul>
                      <!--banner Section-->
                    </div>
                    <div class="tab-pane fade" id="nav-contact1" role="tabpanel" aria-labelledby="nav-contact-tab1">
                      Et et consectetur ipsum labore excepteur est proident excepteur ad velit occaecat qui minim occaecat veniam. Fugiat veniam incididunt anim aliqua enim pariatur veniam sunt est aute sit dolor anim. Velit non irure adipisicing aliqua ullamco irure incididunt irure non esse consectetur nostrud minim non minim occaecat. Amet duis do nisi duis veniam non est eiusmod tempor incididunt tempor dolor ipsum in qui sit. Exercitation mollit sit culpa nisi culpa non adipisicing reprehenderit do dolore. Duis reprehenderit occaecat anim ullamco ad duis occaecat ex.										
                    </div>
                    <div class="tab-pane fade" id="nav-about1" role="tabpanel" aria-labelledby="nav-about-tab1">
                      Amet duis do nisi duis veniam non est eiusmod tempor incididunt tempor dolor ipsum in qui sit. Exercitation mollit sit culpa nisi culpa non adipisicing reprehenderit do dolore. Duis reprehenderit occaecat anim ullamco ad duis occaecat ex. Amet duis do nisi duis veniam non est eiusmod tempor incididunt tempor dolor ipsum in qui sit. Exercitation mollit sit culpa nisi culpa non adipisicing reprehenderit do dolore. Duis reprehenderit occaecat anim ullamco ad duis occaecat ex.										
                    </div>
                  </div>
                </div>
              </div>
              <!--End individualBox-->	

              <ul class="paginationList">
                <li><a href="" title="">Prev</a></li>
                <li><a href="" title="">1</a></li>
                <li><a href="" title="">3</a></li>
                <li><a href="" title="">4</a></li>
                <li><a href="" title="">Next</a></li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!--End categorySection--> 
    
    <jsp:include page="/WEB-INF/views/dashboard/shared/footer.jsp" />
</body>
</html>

