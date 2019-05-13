<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="images" value="/resources/images" />


<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

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

<spring:url var="cssPds" value="/resources/custom-resources" />
<spring:url var="jsPds" value="/resources/custom-resources" />

<link href="${cssPds}/cssClass-min.css" rel="stylesheet">
<link href="${cssPds}/fonts/font-awesome.min.css" rel="stylesheet">



</head>
<body>

	<jsp:include page="/WEB-INF/views/dashboard/shared/navigation.jsp" />

	<div class="mainContainer">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="card">
						<!-- Default panel contents -->
						<div class="card-heading  text-center text-primary"
							style="background: #93CBF9; color: #fff; font-size: 15px;">
							PDS<span class="pull-right"><a href="#" role="button"
								style="background: #93CBF9; color: #fff; font-size: 15px;">
									<i class="fa fa-history" aria-hidden="true"></i> Back to List
							</a></span>
						</div>
						<div class="card-body">
							<form:form method="post" role="form" modelAttribute="album"
								action="${contextPath}/pds" class="form-horizontal"
								enctype="multipart/form-data">
								<div class="form-group">
									<div class="col-sm-9">
										<form:input type="text" class="form-control" path="shortTitle"
											placeholder="Company Name" />
									</div>
								</div>








								<div class="child_information">
									<button type="button"
										class="btn btn-info add_child_row_attachment"
										data-child-validation="required|min_row[1]|max_row[3]|exact_row[3]">Upload
										New PDS</button>
									<table
										class="table table-condensedtable-bordered  table-responsive table-striped child_list"
										style="display: none;">

										<thead>
											<tr class="childHead">
												<th>Title</th>
												<th>Attachment</th>
												<th>Action</th>
											</tr>
										</thead>
										<tbody class="childs">
											<!--
				<tr class="child">
				     <td>
					     <form:input type="text" class="form-control" 
					     data-validation="trim|required|min_length[1]|max_length[255]" 
					     path="pdsList[0].title"  
					     placeholder="Title"/>
					 </td>
					 
					 <td class="row">
			    	    <label class="pull-left col-sm-8 btn btn-default btn-file">
						    Browse <input type="file"  cssClass="form-control" cssErrorClass="has-error"  
						    data-validation="trim|file_allowed_type[jpeg,jpg,png,doc,docx,pdf,ppt,pptx,csv,xls,xls]"
						    name="file"  placeholder="Attachment"/>

						</label>
						<div class="preview hide col-sm-6">
							<span class="child">
								<a href="" title="" target="_blank">
								<i class="fa fa fa-cloud-download" aria-hidden="true"></i></a>
							</span>
						</div>
					 </td>
					    
					  	<td>
							<button type="button" class="btn btn-danger remove_child_row">
							<i class="fa fa-trash"></i>
							</button>
					  </td>
					</tr>
				-->
											<c:forEach items="${album.pdsList}" varStatus="loop"
												var="pds">
												<c:if test="${pds.id!=null}">
													<tr class="child preloaded"
														data-action="${pageContext.request.contextPath}/pds/delete/${pds.id}">
														<form:hidden path="pdsList[${loop.index}].id" />

														<td><form:input type="text" class="form-control"
																data-validation="trim|required|min_length[1]|max_length[255]"
																path="pdsList[${loop.index}].title" placeholder="Title" />&nbsp;
														</td>
														<td class="row"><label
															class="pull-left col-sm-6 btn btn-default btn-file">
																Browse <input style="background: #93CBF9; color: #fff"
																type="file" cssClass="form-control"
																data-validation="trim|file_allowed_type[jpeg,jpg,png,doc,docx,pdf,ppt,pptx,csv,xls,xls]"
																name="file" placeholder="Attachment" />
														</label>
															<div class="preview col-sm-6">
																<span class="child"> <a
																	href="${contextPath}/upload/${pds.attachment}"
																	title="${pds.attachment}" target="_blank"> <i
																		class="fa fa fa-cloud-download" aria-hidden="true"></i>
																</a>
																</span>
															</div></td>
														<td>
															<button type="button"
																class="btn btn-danger remove_child_row">
																<i class="fa fa-trash"></i>
															</button>
														</td>
													</tr>
												</c:if>
											</c:forEach>
										</tbody>
									</table>
								</div>








								<div class="form-group">
									<div class="col-sm-offset-4 col-sm-5">
										<button type="submit" class="btn btn-primary">&nbsp;
											Save &nbsp;</button>
									</div>
								</div>
							</form:form>
						</div>
					</div>

				</div>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/views/dashboard/shared/footer.jsp" />

	<script src="${jsPds}/app.js"></script>
	<script src="${jsPds}/bootbox.min.js"></script>
	<script src="${jsPds}/valigniter.js"></script>
</body>
</html>

