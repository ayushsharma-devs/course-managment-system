# 📚 Course Management System

A simple Java-based Course Management System that allows you to manage courses and students using a MySQL backend. This project was built using **Java**, **JDBC**, and **MySQL**.

---

## 🚀 Features

- Add new courses
- Add new students
- Link students to courses
- View course and student information
- JDBC-based MySQL database interaction

---

## 🛠️ Tech Stack

- **Java 17+**
- **MySQL 8.0+**
- **JDBC**
- **VS Code** (or any Java IDE)
- **MySQL Connector/J** (JAR file)

---

## 📁 Project Structure

```

course-management-system/
│
├── lib/
│   └── mysql-connector-j-9.3.0.jar     # MySQL JDBC Driver
│
├── src/
│   ├── Course.java
│   ├── CourseDAO.java
│   ├── DBConnection.java
│   ├── Main.java
│   ├── Student.java
│   └── StudentDAO.java
│
└── .vscode/
└── launch.json                    # VS Code run config (optional)

````

---

## ⚙️ Setup & Run Instructions

### 1. 📦 Requirements

- Java JDK 17 or higher
- MySQL 8.0 or higher
- MySQL Connector/J JAR file

### 2. 🛠️ MySQL Setup

Start MySQL and run the following commands to create the required database and tables:

```sql
CREATE DATABASE course_management;
USE course_management;

CREATE TABLE courses (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    credits INT
);

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100)
);
````

### 3. 🧩 Update DB Connection

In `DBConnection.java`, update:

```java
String url = "jdbc:mysql://localhost:3306/course_management";
String user = "your_mysql_username";
String password = "your_mysql_password";
```

### 4. 🔧 Compile & Run

#### Option A: Using terminal

```bash
# Compile
javac -cp ".;lib/mysql-connector-j-9.3.0.jar" src/*.java

# Run
java -cp ".;lib/mysql-connector-j-9.3.0.jar;src" Main
```

> Use `:` instead of `;` as the classpath separator on macOS/Linux.

---

## ✅ Output

```
=== Course Management System ===
1. Add Course
2. View All Courses
3. Update Course
4. Delete Course
5. Add Student
6. View All Students
7. Update Student
8. Delete Student
9. Exit
Choose an option: 
```

---

## 📌 Notes

* Ensure MySQL server is running.
* Make sure the JAR file is present at `lib/mysql-connector-j-9.3.0.jar`.
* You can expand the project to include course registration, delete functionality, or a GUI.

---

## 📄 License

This project is open source and free to use under the [MIT License](LICENSE).

---

## 🙋‍♂️ Author

Made with ❤️ by Ayush Sharma

```

