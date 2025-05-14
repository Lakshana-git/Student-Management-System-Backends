Student Management System
Description
A Student Management System built with Java, Servlets, JSP, and MySQL. The application allows administrators to:

Add new students to the system.

View the list of all students.

Delete student records.

This project demonstrates CRUD operations, database connectivity, and Java-based web development.

Features
Add new student information (name and email).

View all student records.

Delete a student's record.

Simple, easy-to-use interface using JSP.

Tech Stack
Frontend: HTML, JSP

Backend: Java (Servlets)

Database: MySQL

Installation
Clone this repository:
git clone https://github.com/yourusername/Student-Management-System.git
Setup MySQL:

Create a database named studentdb (or any name you prefer).

Use the following SQL query to create the students table:
CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100)
);
Configure Database Connection:

Modify the database connection details in the DBConnect.java file:
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/yourdb", "root", "yourpassword");
Run the application:

Deploy the project on a servlet container like Apache Tomcat.

Navigate to http://localhost:8080/StudentApp in your browser.

How to Use
Add a Student: Go to add.jsp, enter the student’s name and email, and click "Add".

View Students: Go to view.jsp to see the list of students.

Delete a Student: Click the "Delete" link next to a student's name in the list.

Contributing
If you'd like to contribute to this project:

Fork the repository.

Create a new branch.

Make your changes.

Submit a pull request.

How this Helps:
Explanation: Provides a clear overview of the project.

Tech stack: Shows which technologies you’ve used.

Setup Instructions: Easy steps for setting up and running the project.

Usage: Clearly explains how to use the app.
