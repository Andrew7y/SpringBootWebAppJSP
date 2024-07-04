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
            background: #f4f4f4;
            color: #333;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            min-height: 100vh;
            margin: 0;
        }

        h1 {
            font-size: 2.5rem;
            margin-bottom: 20px;
            color: #007BFF; /* Primary blue */
        }

        a {
            display: inline-block;
            padding: 15px 30px;
            background-color: #007BFF;
            color: white;
            text-decoration: none;
            border-radius: 5px;
            transition: background-color 0.3s;
            margin: 10px 0;
        }

        a:hover {
            background-color: #0056b3; /* Darker blue on hover */
        }
    </style>
</head>
<body>
<h1>Index</h1>
<a href="/list_contact">Click here to list all contacts</a>
<a href="/list_student">Click here to list all students</a>
</body>
</html>
