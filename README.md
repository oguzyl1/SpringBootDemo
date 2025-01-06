# Student Management System 📚

This is a simple **Student Management System** built using **Spring Boot**. The system supports CRUD operations on student records. 

## Features ✨
- **Student Entity**: Name, email, DOB, and calculates age.
- **Student Repository**: Handles database CRUD operations.
- **PostgreSQL Database**: Uses PostgreSQL for persistence.
- **Validation**: Prevents duplicate emails.

## Technologies ⚙️
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL**
- **Java 17**
- **Maven**

## Endpoints 🌍
- `GET /api/v1/student`: Get all students.
- `POST /api/v1/student`: Add a new student.
- `DELETE /api/v1/student/{studentId}`: Delete a student.
- `PUT /api/v1/student/{studentId}`: Update student details.

