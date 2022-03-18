<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ page isELIgnored = "false" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="./base.jsp" %>
</head>
<body>
<div class= "container mt-4">
<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Product Name</th>
      <th scope="col">Product Description</th>
      <th scope="col">Product Price</th>
      <th scope="col">Product Action</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach items="${products }" var="p" >
     <tr>
      <th scope="row">${p.pId }</th>
      <td>${p.pName }</td>
      <td>${p.pDiscription }</td>
      <td>${p.pPrice }</td>
      <td><a href="delete/${p.pId }"> <i class="fa fa-trash"></i></a>
          <a href="update/${p.pId }"> <i class="fa fa-edit"></i></a>
      </td>
    </tr>
    </c:forEach>
  
  </tbody>
</table>
<div class="container text-center">
<a href="add" class="btn btn-outline-success">Add Product</a>
</div>
</div>
</body>
</html>