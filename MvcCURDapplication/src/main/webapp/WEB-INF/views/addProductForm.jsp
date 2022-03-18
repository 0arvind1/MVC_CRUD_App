<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp" %>
</head>
<body>
<div class="container m-4" >
  
  <section class="panel panel-default">
<div class="panel-heading"> 
<h3 class="panel-title">ADD Product</h3> 
</div> 
<div class="panel-body">
  
<form action="productAdded" class="form-horizontal" role="form" method="post">

   <div class="form-group">
    <label for="pName" class="col-sm-3 control-label">Product Name</label>
    <div class="col-sm-9">
      <input type="text" class="form-control" name="pName" id="pName" placeholder="ADD PRODUCT NAME here..">
    </div>
  </div> <!-- form-group // -->

   <div class="form-group">
    <label for="pDiscription" class="col-sm-3 control-label">Product Discription</label>
    <div class="col-sm-9">
      <textarea  class="form-control" name="pDiscription" id="pDiscription" placeholder="ADD PRODUCT Discription here.." rows="5"></textarea>
    </div>
  </div> <!-- form-group // -->
   <div class="form-group">
    <label for="pPrice" class="col-sm-3 control-label">Product Price</label>
    <div class="col-sm-9">
      <input type="number" class="form-control" name="pPrice" id="pPrice" placeholder="ADD PRODUCT Price here..">
    </div>
  </div>
  <hr>
  <div class="form-group">
    <div class="col-sm-offset-3 col-sm-9">
      <button type="submit" class="btn btn-primary">Submit</button>
    </div>
  </div> <!-- form-group // -->
</form>
  
</div><!-- panel-body // -->
</section><!-- panel// -->

  
</div> <!-- container// --></body>
</html>


