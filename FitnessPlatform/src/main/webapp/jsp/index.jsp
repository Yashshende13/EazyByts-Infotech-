<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Fitness and Wellness Platform</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/custom.css">
</head>
<body>
    <div class="container">
        <h2>Welcome to the Fitness and Wellness Platform</h2>
        <p>Hello, ${sessionScope.user.name}! Here are your plans:</p>
        
        <div>
            <h3>Workout Plans</h3>
            <ul>
                <c:forEach var="plan" items="${workoutPlans}">
                    <li>${plan}</li>
                </c:forEach>
            </ul>
        </div>
        
        <div>
            <h3>Nutrition Plans</h3>
            <ul>
                <c:forEach var="plan" items="${nutritionPlans}">
                    <li>${plan}</li>
                </c:forEach>
            </ul>
        </div>
    </div>
</body>
</html>
