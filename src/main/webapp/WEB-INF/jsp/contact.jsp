<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Contact List - Spring Boot</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f4f4f4;
            margin: 20px;
        }

        h1 {
            text-align: center;
            color: #007BFF; /* Primary Blue */
            margin-bottom: 20px;
        }

        table {
            width: 80%;
            margin: 0 auto;
            border-collapse: collapse;
            box-shadow: 0 4px 8px rgba(0,0,0,0.1);
        }

        th, td {
            padding: 15px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #007BFF;
            color: white;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        tr:hover {
            background-color: #ddd;
        }
    </style>
</head>
<body>
<h1>My Contact List (JSP)</h1>
<table>
    <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Country</th>
    </tr>
    <c:forEach var="contact" items="${contacts}">
        <tr>
            <td>${contact.name}</td>
            <td>${contact.email}</td>
            <td>${contact.country}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
