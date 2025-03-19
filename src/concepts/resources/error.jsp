<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Error Page</title>
</head>
<body>
<h1>Oops! Something went wrong.</h1>
<p>Please provide the following information so we can investigate further:</p>

<form:form method="post" action="/submit-error" modelAttribute="errorForm">
  <div>
    <label for="name">Name:</label>
    <form:input path="name" id="name" />
  </div>
  <div>
    <label for="phoneNumber">Phone Number:</label>
    <form:input path="phoneNumber" id="phoneNumber" />
  </div>
  <div>
    <label for="errorDetails">Error Details:</label>
    <form:textarea path="errorDetails" id="errorDetails" />
  </div>
  <button type="submit">Submit</button>
</form:form>
</body>
</html>
