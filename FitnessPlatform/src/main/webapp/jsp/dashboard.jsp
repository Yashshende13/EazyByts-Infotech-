<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Dashboard</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <style>
        .dashboard-header {
            margin: 30px 0;
        }
        .dashboard-card {
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
            transition: transform 0.3s;
        }
        .dashboard-card:hover {
            transform: scale(1.05);
        }
        .section-header {
            margin: 20px 0;
        }
    </style>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Fitness & Wellness</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item">
                        <a class="nav-link active" href="#">Dashboard</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Profile</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Settings</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/logout">Logout</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <div class="container dashboard-header">
        <h2 class="text-center">Welcome, ${user.name}!</h2>
        <p class="text-center">Here you can manage your workout plans, nutrition plans, and track your progress.</p>
    </div>

    <div class="container">
        <!-- Workout Plans Section -->
        <div class="section-header">
            <h3>Workout Plans</h3>
        </div>
        <div class="row">
            <c:forEach var="plan" items="${workoutPlans}">
                <div class="col-md-4">
                    <div class="card dashboard-card">
                        <div class="card-body">
                            <h5 class="card-title">${plan.name}</h5>
                            <p class="card-text">${plan.description}</p>
                            <a href="#" class="btn btn-primary">View Plan</a>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>

        <!-- Nutrition Plans Section -->
        <div class="section-header">
            <h3>Nutrition Plans</h3>
        </div>
        <div class="row">
            <c:forEach var="nutrition" items="${nutritionPlans}">
                <div class="col-md-4">
                    <div class="card dashboard-card">
                        <div class="card-body">
                            <h5 class="card-title">${nutrition.name}</h5>
                            <p class="card-text">${nutrition.description}</p>
                            <a href="#" class="btn btn-success">View Nutrition Plan</a>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>

        <!-- Progress Section (Placeholder for future use) -->
        <div class="section-header">
            <h3>Your Progress</h3>
            <p>Track your fitness progress over time. (Coming soon!)</p>
        </div>
    </div>

    <footer class="bg-light text-center text-lg-start mt-4">
        <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.05);">
            © 2024 Fitness & Wellness Platform
        </div>
    </footer>
</body>
</html>
