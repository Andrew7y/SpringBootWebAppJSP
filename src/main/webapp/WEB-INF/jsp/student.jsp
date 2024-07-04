<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Contact List</title>
    <link rel="stylesheet" href="std_styles.css">
</head>
<body>
<h1 class="page-title">My Contact List</h1>
<table class="contact-table">
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
