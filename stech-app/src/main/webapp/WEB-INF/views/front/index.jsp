<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>



<spring:url var="images" value="/resources/images" />
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
    <div class="homeBanner">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <h1>Hire freelancers. <br>Make things happen.<span class="tm">™</span></h1>
            <span class="grow">Grow your business through the top freelancing <small>website. Hire talent nearby or worldwide.</small></span>			 		 
            <form action="#" class="searchForm">
              <div class="searchBtn"><input type="text" placeholder="" ></div>
              <a href="#costumModal10" role="button" class="btn btn-default btnPopup" data-toggle="modal">Get Started</a>				
            </form>
          </div>
        </div>
      </div>
    </div>
    <!--End homeBanner-->
    <div class="logoMainarea">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <div class="logoList">
              <h3>Trusted by 5M+ businesses</h3>
              <img src="${images}/clientLogo.jpg" alt="">
            </div>
          </div>
        </div>
      </div>
    </div>
    <!--End logoMainarea--> 		
    <div class="caseMainarea">
      <div class="container">
        <div class="row">
          <div class="col-md-3">
            <h3>Hire for any scope <span>of work:</span> </h3>
          </div>
          <div class="col-md-3">
            <div class="useCase">
              <h4>Short-term tasks</h4>
              <span>Build a pool of diverse experts for one-off tasks</span>							
            </div>
          </div>
          <div class="col-md-3">
            <div class="useCase">
              <h4>Recurring projects </h4>
              <span>Have a go-to team with specialized skills </span>							
            </div>
          </div>
          <div class="col-md-3">
            <div class="useCase">
              <h4>Full-time contract work </h4>
              <span>Expand your staff with a dedicated team </span>							
            </div>
          </div>
        </div>
      </div>
    </div>
    <!--End caseMainarea--> 
    <div class="categorySection">
      <h2>Build a pool of trusted experts for your team</h2>
      <div class="container">
        <div class="row">
          <div class="col-md-6 col-lg-3">
            <div class="flip-container" ontouchstart="this.classList.toggle('hover');">
              <div class="flipper">
                <div class="front">
                  <img src="${images}/icon.jpg" alt="">
                  <span>Web Developers</span>
                </div>
                <a class="back" href="">
                <small>Front-end Developers Back-end Developers Software Programmers</small>
                <span>See More <i class="fa fa-chevron-right"></i></span>
                </a>
              </div>
            </div>
          </div>
          <div class="col-md-6 col-lg-3">
            <div class="flip-container" ontouchstart="this.classList.toggle('hover');">
              <div class="flipper">
                <div class="front">
                  <img src="${images}/icon1.jpg" alt="">
                  <span>Mobile Developers</span>
                </div>
                <a class="back" href="">
                <small>iOS App Developers Android Developers UI/UX Designers</small>
                <span>See More <i class="fa fa-chevron-right"></i></span>
                </a>
              </div>
            </div>
          </div>
          <div class="col-md-6 col-lg-3">
            <div class="flip-container" ontouchstart="this.classList.toggle('hover');">
              <div class="flipper">
                <div class="front">
                  <img src="${images}/icon2.jpg" alt="">
                  <span>Designers & Creatives</span>
                </div>
                <a class="back" href="">
                <small>Graphic Designers UI/UX Designers Motion Graphics Experts</small>
                <span>See More <i class="fa fa-chevron-right"></i></span>
                </a>
              </div>
            </div>
          </div>
          <div class="col-md-6 col-lg-3">
            <div class="flip-container" ontouchstart="this.classList.toggle('hover');">
              <div class="flipper">
                <div class="front">
                  <img src="${images}/icon3.jpg" alt="">
                  <span>Writers</span>
                </div>
                <a class="back" href="">
                <small>Blog Writers Content Writers Copywriters</small>
                <span>See More <i class="fa fa-chevron-right"></i></span>
                </a>
              </div>
            </div>
          </div>
          <div class="col-md-6 col-lg-3">
            <div class="flip-container" ontouchstart="this.classList.toggle('hover');">
              <div class="flipper">
                <div class="front">
                  <img src="${images}/icon4.jpg" alt="">
                  <span>Virtual Assistants</span>
                </div>
                <a class="back" href="">
                <small>Personal Assistants Transcriptionists Web Researchers</small>
                <span>See More <i class="fa fa-chevron-right"></i></span>
                </a>
              </div>
            </div>
          </div>
          <div class="col-md-6 col-lg-3">
            <div class="flip-container" ontouchstart="this.classList.toggle('hover');">
              <div class="flipper">
                <div class="front">
                  <img src="${images}/icon5.jpg" alt="">
                  <span>Customer Service Agents</span>
                </div>
                <a class="back" href="">
                <small>Phone Support Specialists Email Support Experts Live Chat Support Pros</small>
                <span>See More <i class="fa fa-chevron-right"></i></span>
                </a>
              </div>
            </div>
          </div>
          <div class="col-md-6 col-lg-3">
            <div class="flip-container" ontouchstart="this.classList.toggle('hover');">
              <div class="flipper">
                <div class="front">
                  <img src="${images}/icon6.jpg" alt="">
                  <span>Sales & Marketing Experts</span>
                </div>
                <a class="back" href="">
                <small>SEO Specialists Email Automators Marketing Experts</small>
                <span>See More <i class="fa fa-chevron-right"></i></span>
                </a>
              </div>
            </div>
          </div>
          <div class="col-md-6 col-lg-3">
            <div class="flip-container" ontouchstart="this.classList.toggle('hover');">
              <div class="flipper">
                <div class="front">
                  <img src="${images}/icon7.jpg" alt="">
                  <span>Accountants & Consultants</span>
                </div>
                <a class="back" href="">
                <small>Tax Accountants Bookkeepers Financial Modelers</small>
                <span>See More <i class="fa fa-chevron-right"></i></span>
                </a>
              </div>
            </div>
          </div>
          <div class="col-md-12 bottomBtn">
            <a href="" title="" class="moreButton">See All Categories</a>
          </div>
        </div>
      </div>
    </div>
    <!--End categorySection--> 
    <div class="categorySection gallerySection">
      <h2>Gallery </h2>
      <div class="container">
        <div class="row">
          <div class="col-md-6 col-lg-3">
            <div class="boxcontainer">
              <img src="${images}/hotelPic10.jpg" alt="" class="gallery-image">	
              <div class="overlayBg">
                <div class="viewText albumText">
                  <p><span>Album Name</span> 12 Aug 2018</p>
                  <a href="" title="">View Album</a>
                </div>
              </div>
            </div>
          </div>
          <div class="col-md-6 col-lg-3">
            <div class="boxcontainer">
              <img src="${images}/hotelPic10.jpg" alt="" class="gallery-image">	
              <div class="overlayBg">
                <div class="viewText albumText">
                  <p><span>Album Name</span> 12 Aug 2018</p>
                  <a href="" title="">View Album</a>
                </div>
              </div>
            </div>
          </div>
          <div class="col-md-6 col-lg-3">
            <div class="boxcontainer">
              <img src="${images}/hotelPic10.jpg" alt="" class="gallery-image">	
              <div class="overlayBg">
                <div class="viewText albumText">
                  <p><span>Album Name</span> 12 Aug 2018</p>
                  <a href="" title="">View Album</a>
                </div>
              </div>
            </div>
          </div>
          <div class="col-md-6 col-lg-3">
            <div class="boxcontainer">
              <img src="${images}/hotelPic10.jpg" alt="" class="gallery-image">	
              <div class="overlayBg">
                <div class="viewText albumText">
                  <p><span>Album Name</span> 12 Aug 2018</p>
                  <a href="" title="">View Album</a>
                </div>
              </div>
            </div>
          </div>
          <div class="col-md-6 col-lg-3">
            <div class="boxcontainer">
              <img src="${images}/hotelPic10.jpg" alt="" class="gallery-image">	
              <div class="overlayBg">
                <div class="viewText albumText">
                  <p><span>Album Name</span> 12 Aug 2018</p>
                  <a href="" title="">View Album</a>
                </div>
              </div>
            </div>
          </div>
          <div class="col-md-6 col-lg-3">
            <div class="boxcontainer">
              <img src="${images}/hotelPic10.jpg" alt="" class="gallery-image">	
              <div class="overlayBg">
                <div class="viewText albumText">
                  <p><span>Album Name</span> 12 Aug 2018</p>
                  <a href="" title="">View Album</a>
                </div>
              </div>
            </div>
          </div>
          <div class="col-md-6 col-lg-3">
            <div class="boxcontainer">
              <img src="${images}/hotelPic10.jpg" alt="" class="gallery-image">	
              <div class="overlayBg">
                <div class="viewText albumText">
                  <p><span>Album Name</span> 12 Aug 2018</p>
                  <a href="" title="">View Album</a>
                </div>
              </div>
            </div>
          </div>
          <div class="col-md-6 col-lg-3">
            <div class="boxcontainer">
              <img src="${images}/hotelPic10.jpg" alt="" class="gallery-image">	
              <div class="overlayBg">
                <div class="viewText albumText">
                  <p><span>Album Name</span> 12 Aug 2018</p>
                  <a href="" title="">View Album</a>
                </div>
              </div>
            </div>
          </div>
          <div class="col-md-12 bottomBtn">
            <a href="" title="" class="moreButton">See All Gallery</a>
          </div>
        </div>
      </div>
    </div>
    <!--End categorySection--> 
    <div class="categorySection howitWorks">
      <h2>How it works</h2>
      <div class="container">
        <div class="row">
          <div class="col-md-6 col-lg-3">
            <div class="postContent">
              <img src="${images}/icon8.jpg" alt="">
              <h4>Post a job (it’s free)</h4>
              <p>Tell us about your project. Upwork connects you with top talent around the world, or near you.</p>
            </div>
          </div>
          <div class="col-md-6 col-lg-3">
            <div class="postContent">
              <img src="${images}/icon9.jpg" alt="">
              <h4>Freelancers come to you</h4>
              <p>Get qualified proposals within 24 hours. Compare bids, reviews, and prior work. Interview favorites and hire the best fit.</p>
            </div>
          </div>
          <div class="col-md-6 col-lg-3">
            <div class="postContent">
              <img src="${images}/icon10.jpg" alt="">
              <h4>Collaborate easily</h4>
              <p>Use Upwork to chat or video call, share files, and track project milestones from your desktop or mobile.</p>
            </div>
          </div>
          <div class="col-md-6 col-lg-3">
            <div class="postContent">
              <img src="${images}/icon11.jpg" alt="">
              <h4>Payment simplified</h4>
              <p>Pay hourly or fixed-price and receive invoices through Upwork. Only pay for work you authorize.</p>
            </div>
          </div>
          <div class="col-md-12 bottomBtn">
            <ul class="owl-carousel">
              <li><iframe width="560" height="315" src="https://www.youtube.com/embed/7aZsxvGQ2tw" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe></li>
              <li><iframe width="560" height="315" src="https://www.youtube.com/embed/cTk9GVM303w" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe></li>
              <li><iframe width="560" height="315" src="https://www.youtube.com/embed/GdbqOe5xVks" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe></li>
              <li><iframe width="560" height="315" src="https://www.youtube.com/embed/7aZsxvGQ2tw" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe></li>
              <li><iframe width="560" height="315" src="https://www.youtube.com/embed/cTk9GVM303w" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe></li>
              <li><iframe width="560" height="315" src="https://www.youtube.com/embed/GdbqOe5xVks" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe></li>
            </ul>
            <!--banner Section-->
          </div>
        </div>
      </div>
    </div>
    <!--End categorySection--> 		
    <div class="serviceSection">
      <h2>Find the level of service that works for you</h2>
      <p class="headerTittle">Each option includes access to Upwork’s large pool of top-quality freelancers. <span>Choose the level of service you need.</span></p>
      <div class="container">
        <div class="row">
          <div class="col-md-4">
            <div class="professionalContent">
              <div class="topHeader">
                <h4>Upwork</h4>
                <span>Professional freelancers and the essentials.</span>
                <a href="" title="" class="moreButton">Sign Up for Free</a>
              </div>
              <ul class="listInnerbox">
                <li><i class="fa fa-check"></i>Verified freelancer work history and reviews</li>
                <li><i class="fa fa-check"></i>Instant match with the right freelancers</li>
                <li><i class="fa fa-check"></i>Built-in collaboration tools and easy payment</li>
                <li><i class="fa fa-check"></i>Upwork Payment Protection Plan</li>
              </ul>
            </div>
          </div>
          <div class="col-md-4">
            <div class="professionalContent">
              <div class="topHeader topborder">
                <h4>Upwork Pro</h4>
                <span>Dedicated support and handpicked talent.</span>
                <a href="" title="" class="moreButton">Learn More</a>
              </div>
              <ul class="listInnerbox">
                <li><i class="fa fa-check"></i>Everything from Upwork service level</li>
                <li><i class="fa fa-check"></i>Premium freelancers curated by Upwork</li>
                <li><i class="fa fa-check"></i>Job post and talent search assistance</li>
                <li><i class="fa fa-check"></i>Ability to pre-fund account</li>
              </ul>
            </div>
          </div>
          <div class="col-md-4">
            <div class="professionalContent">
              <div class="topHeader topborder1">
                <h4>Upwork Enterprise</h4>
                <span>Custom solution to fit your company’s needs.</span>
                <a href="" title="" class="moreButton">Learn More</a>
              </div>
              <ul class="listInnerbox">
                <li><i class="fa fa-check"></i>Everything from Upwork and Upwork Pro</li>
                <li><i class="fa fa-check"></i>Consolidated invoicing and billing</li>
                <li><i class="fa fa-check"></i>Custom portal, contract management, and reporting</li>
                <li><i class="fa fa-check"></i>Worker classification compliance services</li>
                <li><i class="fa fa-check"></i>Dedicated account management </li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!--End categorySection--> 		
    <div class="videoTestimonialSection">
      <div class="container">
        <div class="row flex-reverse">
          <div class="col-md-6">
            <div class="videopicContent">
              <img src="${images}/videopic.png" alt="">
            </div>
          </div>
          <div class="col-md-6">
            <h2>Instapage saved $2.3M with Upwork</h2>
            <p class="italicText"><em>"Upwork took a lot of stress off of growing with minimal resources"</em></p>
            <div class="thumFlex">
              <div class="thumFlexright">
                <img src="${images}/thum.png" alt="">
              </div>
              <div class="info vs-color-gray-granite">
                <small><strong>Tyson Quick</strong><br><span>CEO and co-founder, Instapage</span></small>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!--End videoTestimonialSection--> 	
    <div class="skillsSection">
      <div class="container">
        <div class="row ">
          <div class="col-md-6">
            <h3>Top skills</h3>
            <ul class="innerList">
              <li><a href="" title="">Android Developer</a></li>
              <li><a href="" title="">Customer Service Representative</a></li>
              <li><a href="" title="">Front-End Developer</a></li>
              <li><a href="" title="">iOS Developer</a></li>
              <li><a href="" title="">Mobile App Developer</a></li>
              <li><a href="" title="">Sales Consultant</a></li>
              <li><a href="" title="">Software Engineer</a></li>
              <li><a href="" title="">Virtual Assistant</a></li>
              <li><a href="" title="">Bookkeeper</a></li>
              <li><a href="" title="">Database Administrator</a></li>
            </ul>
            <div id="text">
              <ul class="innerList">
                <li><a href="" title="">Game Developer</a></li>
                <li><a href="" title="">Java Developer</a></li>
                <li><a href="" title="">PHP Developer</a></li>
                <li><a href="" title="">SEO Expert</a></li>
                <li><a href="" title="">Technical Writer</a></li>
                <li><a href="" title="">Web Designer</a></li>
                <li><a href="" title="">Content Writer</a></li>
                <li><a href="" title="">Data Scientist</a></li>
                <li><a href="" title="">Graphic Designer</a></li>
                <li><a href="" title="">JavaScript Developer</a></li>
                <li><a href="" title="">Python Developer</a></li>
                <li><a href="" title="">Social Media Manager</a></li>
                <li><a href="" title="">UI Designer</a></li>
                <li><a href="" title="">Wordpress Developer</a></li>
                <li><a href="" title="">Copywriter</a></li>
                <li><a href="" title="">Facebook Developer</a></li>
                <li><a href="" title="">Information Security Analyst</a></li>
                <li><a href="" title="">Logo Designer</a></li>
                <li><a href="" title="">Resume Writer</a></li>
                <li><a href="" title="">Software Developer</a></li>
                <li><a href="" title="">UX Designer</a></li>
                <li><a href="" title="">Writer</a></li>
              </ul>
            </div>
            <div class="btn-container">
              <button id="toggle">View More</button>
            </div>
          </div>
          <div class="col-md-6">
            <h3>Trending skill</h3>
            <ul class="innerList">
              <li><a href="" title="">Apple UIKit</a></li>
              <li><a href="" title="">Blockchain</a></li>
              <li><a href="" title="">GitLab</a></li>
              <li><a href="" title="">Node.js</a></li>
              <li><a href="" title="">Scala development</a></li>
              <li><a href="" title="">Dropbox API</a></li>
              <li><a href="" title="">Social customer service</a></li>
              <li><a href="" title="">Proposal writing</a></li>
              <li><a href="" title="">Apple Xcode</a></li>
              <li><a href="" title="">Customer retention</a></li>
            </ul>
            <div id="text1">
              <ul class="innerList">
                <li><a href="" title="">Go development</a></li>
                <li><a href="" title="">Product photography</a></li>
                <li><a href="" title="">SCORM</a></li>
                <li><a href="" title="">iPhone UI design</a></li>
                <li><a href="" title="">HR consulting</a></li>
                <li><a href="" title="">Vuforia</a></li>
                <li><a href="" title="">Articulate storyline</a></li>
                <li><a href="" title="">eLearning</a></li>
                <li><a href="" title="">Google App Engine API</a></li>
                <li><a href="" title="">Rapid prototyping</a></li>
                <li><a href="" title="">Tensorflow</a></li>
                <li><a href="" title="">Genetic algorithms</a></li>
                <li><a href="" title="">Oculus Rift</a></li>
                <li><a href="" title="">Instructional design</a></li>
                <li><a href="" title="">Atlassian Confluence</a></li>
                <li><a href="" title="">Enterprise architecture</a></li>
                <li><a href="" title="">Google Cloud Platform</a></li>
                <li><a href="" title="">Risk management</a></li>
                <li><a href="" title="">Volusion</a></li>
                <li><a href="" title="">Vue.js</a></li>
                <li><a href="" title="">Microsoft Power BI</a></li>
                <li><a href="" title="">React.js</a></li>
              </ul>
            </div>
            <div class="btn-container">
              <button id="toggle1">View More</button>
            </div>
          </div>
          <div class="col-md-12 bottomBtn">
            <a href="" title="" class="moreButton">View All Skills</a>
          </div>
        </div>
      </div>
    </div>
    <!--End skillsSection--> 
    <div class="skillsSection">
      <div class="container">
        <div class="row ">
          <div class="col-md-6">
            <h3>Top Skills in US</h3>
            <ul class="innerList">
              <li><a href="" title="">Adobe Illustrator Experts in US</a></li>
              <li><a href="" title="">Adobe Photoshop Experts in US</a></li>
              <li><a href="" title="">Content Writers in US</a></li>
              <li><a href="" title="">Copywriters in US</a></li>
              <li><a href="" title="">Data Entry Specialists in US</a></li>
              <li><a href="" title="">Editors in US</a></li>
              <li><a href="" title="">HTML Developers in US</a></li>
              <li><a href="" title="">HTML5 Developers in US</a></li>
              <li><a href="" title="">PowerPoint Experts in US</a></li>
              <li><a href="" title="">Social Media Marketers in US</a></li>
            </ul>
            <div id="text2">
              <ul class="innerList">
                <li><a href="" title="">Article Writers in US</a></li>
                <li><a href="" title="">Blog Writers in US</a></li>
                <li><a href="" title="">Creative Writers in US</a></li>
                <li><a href="" title="">Customer Service Representatives in US</a></li>
                <li><a href="" title="">Excel Experts in US</a></li>
                <li><a href="" title="">JavaScript Developers in US</a></li>
                <li><a href="" title="">WordPress Developers in US</a></li>
                <li><a href="" title="">Writers in US</a></li>
              </ul>
            </div>
            <div class="btn-container">
              <button id="toggle2">View More</button>
            </div>
          </div>
          <div class="col-md-6">
            <h3>Top Cities in US</h3>
            <ul class="innerList">
              <li><a href="" title="">Atlanta, GA Freelancers</a></li>
              <li><a href="" title="">Chicago, IL Freelancers</a></li>
              <li><a href="" title="">Las Vegas, NV Freelancers</a></li>
              <li><a href="" title="">Orlando, FL Freelancers</a></li>
              <li><a href="" title="">San Diego, CA Freelancers</a></li>
              <li><a href="" title="">Austin, TX Freelancers</a></li>
              <li><a href="" title="">Dallas, TX Freelancers</a></li>
              <li><a href="" title="">Los Angeles, CA Freelancers</a></li>
              <li><a href="" title="">Philadelphia, PA Freelancers</a></li>
              <li><a href="" title="">San Francisco, CA Freelancers</a></li>
            </ul>
            <div id="text3">
              <ul class="innerList">
                <li><a href="" title="">Brooklyn, NY Freelancers</a></li>
                <li><a href="" title="">Denver, CO Freelancers</a></li>
                <li><a href="" title="">Miami, FL Freelancers</a></li>
                <li><a href="" title="">Phoenix, AZ Freelancers</a></li>
                <li><a href="" title="">San Jose, CA Freelancers</a></li>
                <li><a href="" title="">Charlotte, NC Freelancers</a></li>
                <li><a href="" title="">Houston, TX Freelancers</a></li>
                <li><a href="" title="">New York, NY Freelancers</a></li>
                <li><a href="" title="">Portland, OR Freelancers</a></li>
                <li><a href="" title="">Portland, OR Freelancers</a></li>
              </ul>
            </div>
            <div class="btn-container">
              <button id="toggle3">View More</button>
            </div>
          </div>
          <div class="col-md-12 bottomBtn">
            <a href="" title="" class="moreButton">Browse US Freelancers</a>
          </div>
        </div>
      </div>
    </div>
    <!--End skillsSection--> 
    <div class="ctaSection">
      <div class="container">
        <div class="row ">
          <div class="col-md-12">
            <h3>Build your online team</h3>
            <a href="" title="" >Get Started</a>					
          </div>
        </div>
      </div>
    </div>
    <!--End ctaSection-->
    <div class="footerSection">
      <div class="container">
        <div class="row ">
          <div class="col-md-12">
            <div class="footerTopText">
              <p>Looking to hire for long-term or full-time assignments? See how <a href="" title="">Upwork Payroll</a> simplifies admin.</p>
            </div>
            <!--End footerTopText-->
          </div>
        </div>
        <div class="row borderIcon">
          <div class="col-md-4">
            <div class="footerList">
              <img src="${images}/ftrLogo.png" alt="">
              <p>Top-skilled freelancers and the essentials to find and work with them.</p>
              <span><a href="" title="">Learn more</a></span>					
            </div>
            <!--End footerTopText-->
          </div>
          <div class="col-md-4">
            <div class="footerList">
              <img src="${images}/ftrLogo1.png" alt="">
              <p>Personalized assistance to help you find premium, pre-vetted talent.</p>
              <span><a href="" title="">Learn more</a></span>				
            </div>
            <!--End footerTopText-->
          </div>
          <div class="col-md-4">
            <div class="footerList">
              <img src="${images}/ftrLogo2.png" alt="">
              <p>End-to-end technology and service solution customized to fit your company. </p>
              <span><a href="" title="">Learn more</a></span>				
            </div>
            <!--End footerTopText-->
          </div>
        </div>
        <div class="row borderIcon">
          <div class="col-md-4">
            <div class="footerList">
              <h4>COMPANY</h4>
              <ul>
                <li><a href="" title="">About Us</a></li>
                <li><a href="" title="">Investor Relations</a></li>
                <li><a href="" title="">Careers</a></li>
                <li><a href="" title="">Press</a></li>
                <li><a href="" title="">Trust & Safety</a></li>
                <li><a href="" title="">Terms of Service</a></li>
                <li><a href="" title="">Privacy Policy	</a></li>
              </ul>
            </div>
            <!--End footerTopText-->
          </div>
          <div class="col-md-4">
            <div class="footerList">
              <h4>RESOURCES</h4>
              <ul>
                <li><a href="" title="">Customer Support</a></li>
                <li><a href="" title="">Hiring Headquarters</a></li>
                <li><a href="" title="">Hiring Resources</a></li>
                <li><a href="" title="">Upwork Blog</a></li>
                <li><a href="" title="">Customer Stories</a></li>
                <li><a href="" title="">Business Resources</a></li>
                <li><a href="" title="">Payroll Services</a></li>
              </ul>
            </div>
            <!--End footerTopText-->
          </div>
          <div class="col-md-4">
            <div class="footerList">
              <h4>BROWSE</h4>
              <ul>
                <li><a href="" title="">Freelancers by Skill</a></li>
                <li><a href="" title="">Freelancers in USA</a></li>
                <li><a href="" title="">Freelancers in UK</a></li>
                <li><a href="" title="">Freelancers in Canada</a></li>
                <li><a href="" title="">Freelancers in Australia</a></li>
                <li><a href="" title="">Jobs in USA</a></li>
                <li><a href="" title="">Find Jobs</a></li>
              </ul>
            </div>
            <!--End footerTopText-->
          </div>
        </div>
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
    <!--End footerSection-->
    <div id="costumModal10" class="modal" data-easein="bounceIn"  tabindex="-1" role="dialog" aria-labelledby="costumModalLabel" aria-hidden="true">
      <div class="modal-dialog newEditbox">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
            ×
            </button>
          </div>
          <div class="modal-body">
            <table id="example" class="table table-striped table-bordered" style="width:100%">
              <thead>
                <tr>
                  <th>Photo</th>
                  <th>&nbsp;Name&nbsp;</th>
                  <th>Location</th>
                  <th>Price</th>
                  <th>Date</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td><img src="${images}/hotelPic1.jpg" alt=""></td>
                  <td><b>Resol Gifu</b></td>
                  <td><small>295, 2nd Main Road, JP nagar 3rd Phase, 560078, Bengaluru, India</small></td>
                  <td>$500</td>
                  <td>20/01/2019</td>
                </tr>
                <tr>
                  <td><img src="${images}/thum.png" alt=""></td>
                  <td><b>OYO 12526 Compact Maple Leaf</b></td>
                  <td><small>295, 2nd Main Road, JP nagar 3rd Phase, 560078, Bengaluru, India</small></td>
                  <td>$500</td>
                  <td>20/01/2019</td>
                </tr>
                <tr>
                  <td><img src="${images}/hotelPic1.jpg" alt=""></td>
                  <td><b>Resol Gifu</b></td>
                  <td><small>295, 2nd Main Road, JP nagar 3rd Phase, 560078, Bengaluru, India</small></td>
                  <td>$500</td>
                  <td>20/01/2019</td>
                </tr>
                <tr>
                  <td><img src="${images}/thum.png" alt=""></td>
                  <td><b>OYO 12526 Compact Maple Leaf</b></td>
                  <td><small>295, 2nd Main Road, JP nagar 3rd Phase, 560078, Bengaluru, India</small></td>
                  <td>$500</td>
                  <td>20/01/2019</td>
                </tr>
                <tr>
                  <td><img src="${images}/hotelPic1.jpg" alt=""></td>
                  <td><b>Resol Gifu</b></td>
                  <td><small>295, 2nd Main Road, JP nagar 3rd Phase, 560078, Bengaluru, India</small></td>
                  <td>$500</td>
                  <td>20/01/2019</td>
                </tr>
                <tr>
                  <td><img src="${images}/thum.png" alt=""></td>
                  <td><b>OYO 12526 Compact Maple Leaf</b></td>
                  <td><small>295, 2nd Main Road, JP nagar 3rd Phase, 560078, Bengaluru, India</small></td>
                  <td>$500</td>
                  <td>20/01/2019</td>
                </tr>
                <tr>
                  <td><img src="${images}/hotelPic1.jpg" alt=""></td>
                  <td><b>Resol Gifu</b></td>
                  <td><small>295, 2nd Main Road, JP nagar 3rd Phase, 560078, Bengaluru, India</small></td>
                  <td>$500</td>
                  <td>20/01/2019</td>
                </tr>
                <tr>
                  <td><img src="${images}/thum.png" alt=""></td>
                  <td><b>OYO 12526 Compact Maple Leaf</b></td>
                  <td><small>295, 2nd Main Road, JP nagar 3rd Phase, 560078, Bengaluru, India</small></td>
                  <td>$500</td>
                  <td>20/01/2019</td>
                </tr>
                <tr>
                  <td><img src="${images}/hotelPic1.jpg" alt=""></td>
                  <td><b>Resol Gifu</b></td>
                  <td><small>295, 2nd Main Road, JP nagar 3rd Phase, 560078, Bengaluru, India</small></td>
                  <td>$500</td>
                  <td>20/01/2019</td>
                </tr>
                <tr>
                  <td><img src="${images}/thum.png" alt=""></td>
                  <td><b>OYO 12526 Compact Maple Leaf</b></td>
                  <td><small>295, 2nd Main Road, JP nagar 3rd Phase, 560078, Bengaluru, India</small></td>
                  <td>$500</td>
                  <td>20/01/2019</td>
                </tr>
                <tr>
                  <td><img src="${images}/hotelPic1.jpg" alt=""></td>
                  <td><b>Resol Gifu</b></td>
                  <td><small>295, 2nd Main Road, JP nagar 3rd Phase, 560078, Bengaluru, India</small></td>
                  <td>$500</td>
                  <td>20/01/2019</td>
                </tr>
                <tr>
                  <td><img src="${images}/thum.png" alt=""></td>
                  <td><b>OYO 12526 Compact Maple Leaf</b></td>
                  <td><small>295, 2nd Main Road, JP nagar 3rd Phase, 560078, Bengaluru, India</small></td>
                  <td>$500</td>
                  <td>20/01/2019</td>
                </tr>
                <tr>
                  <td><img src="${images}/hotelPic1.jpg" alt=""></td>
                  <td><b>Resol Gifu</b></td>
                  <td><small>295, 2nd Main Road, JP nagar 3rd Phase, 560078, Bengaluru, India</small></td>
                  <td>$500</td>
                  <td>20/01/2019</td>
                </tr>
                <tr>
                  <td><img src="${images}/thum.png" alt=""></td>
                  <td><b>OYO 12526 Compact Maple Leaf</b></td>
                  <td><small>295, 2nd Main Road, JP nagar 3rd Phase, 560078, Bengaluru, India</small></td>
                  <td>$500</td>
                  <td>20/01/2019</td>
                </tr>
                <tr>
                  <td><img src="${images}/hotelPic1.jpg" alt=""></td>
                  <td><b>Resol Gifu</b></td>
                  <td><small>295, 2nd Main Road, JP nagar 3rd Phase, 560078, Bengaluru, India</small></td>
                  <td>$500</td>
                  <td>20/01/2019</td>
                </tr>
                <tr>
                  <td><img src="${images}/thum.png" alt=""></td>
                  <td><b>OYO 12526 Compact Maple Leaf</b></td>
                  <td><small>295, 2nd Main Road, JP nagar 3rd Phase, 560078, Bengaluru, India</small></td>
                  <td>$500</td>
                  <td>20/01/2019</td>
                </tr>
              </tbody>
            </table>
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
      $(document).ready(function() {
      $('#example').DataTable();
      } );
       
       
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
    <script>
      $('.owl-carousel').owlCarousel({
            items:1,
            merge:true,
            loop:true,
            margin:10,
            video:true,
            lazyLoad:true,
            center:true,
            responsive:{
                480:{
                    items:1
                },
                1200:{
                    items:3
                }
            }
        	})
    </script>
  </body>
</html>




