<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.aiolms.service.CourseService" %>
<%
    CourseService courseService = new CourseService();
%>
<!DOCTYPE html>
<html>
<head>
    <title>AI-OLMS Courses</title>
</head>
<body>

    <h1>Available Courses</h1>

    <ul>
<% for (String course : courseService.getCourses()) { %>
        <li><%= course %></li>
<% } %>
    </ul>

    <br>

    <a href="index.jsp">Back to Home</a>

</body>
</html>
