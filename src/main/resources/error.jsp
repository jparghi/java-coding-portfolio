<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
  <title>Error Page</title>
</head>
<body>
<h1>Oops! Something went wrong.</h1>
<p>An unexpected error occurred. Please try again later.</p>

<% if (exception != null) { %>
<p><b>Error details:</b> <%= exception.getMessage() %></p>
<% } %>
</body>
</html>
