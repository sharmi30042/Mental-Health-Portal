🧠 MindCare

Mental Health Assessment & Therapy Booking System

📌 Overview

MindCare is a full-stack web application designed to help users assess their mental health condition and book therapy sessions easily. The system allows users to answer a set of questions, calculates a score based on their responses, and determines the severity level. Based on the result, users can proceed to book therapy sessions.

🚀 Features

🧾 Mental Health Assessment (PHQ-9 / GAD-7 based)

📊 Automatic Score & Severity Calculation

👩‍⚕️ Therapist Booking System

🗄️ Data Storage using MySQL

🔗 REST APIs for communication

🧩 Layered Architecture (Controller, Service, Repository)

🛠️ Tech Stack

Frontend: HTML, CSS, JavaScript

Backend: Spring Boot

Database: MySQL

Testing: Postman

🏗️ Project Structure

com.example.mentalhealth │ ├── controller ├── service ├── repository ├── model └── MentalHealthApplication.java

⚙️ How It Works

User provides input through frontend

Backend processes responses and calculates score

Severity level is determined

Data is stored in MySQL

User can book a therapy session

📡 API Endpoints

Method Endpoint Description

POST /users Create user

POST /assessment Submit assessment

POST /sessions Book therapy session

🗄️ Database Tables

Users

Assessments

Sessions
