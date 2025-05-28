import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final CourseDAO courseDAO = new CourseDAO();
    private static final StudentDAO studentDAO = new StudentDAO();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Course Management System ===");
            System.out.println("1. Add Course");
            System.out.println("2. View All Courses");
            System.out.println("3. Update Course");
            System.out.println("4. Delete Course");
            System.out.println("5. Add Student");
            System.out.println("6. View All Students");
            System.out.println("7. Update Student");
            System.out.println("8. Delete Student");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");

            int choice = Integer.parseInt(scanner.nextLine());

            try {
                switch (choice) {
                    case 1 -> addCourse();
                    case 2 -> viewCourses();
                    case 3 -> updateCourse();
                    case 4 -> deleteCourse();
                    case 5 -> addStudent();
                    case 6 -> viewStudents();
                    case 7 -> updateStudent();
                    case 8 -> deleteStudent();
                    case 9 -> {
                        System.out.println("Exiting...");
                        System.exit(0);
                    }
                    default -> System.out.println("Invalid choice. Try again.");
                }
            } catch (SQLException e) {
                System.err.println("Database error: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.err.println("Invalid input format.");
            }
        }
    }

    private static void addCourse() throws SQLException {
        System.out.print("Course Name: ");
        String name = scanner.nextLine();
        System.out.print("Instructor: ");
        String instructor = scanner.nextLine();
        System.out.print("Credits: ");
        int credits = Integer.parseInt(scanner.nextLine());

        Course course = new Course(name, instructor, credits);
        courseDAO.addCourse(course);
        System.out.println("Course added successfully.");
    }

    private static void viewCourses() throws SQLException {
        List<Course> courses = courseDAO.getAllCourses();
        if (courses.isEmpty()) {
            System.out.println("No courses found.");
            return;
        }
        for (Course c : courses) {
            System.out.println(c);
        }
    }

    private static void updateCourse() throws SQLException {
        System.out.print("Enter Course ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("New Course Name: ");
        String name = scanner.nextLine();
        System.out.print("New Instructor: ");
        String instructor = scanner.nextLine();
        System.out.print("New Credits: ");
        int credits = Integer.parseInt(scanner.nextLine());

        Course course = new Course(id, name, instructor, credits);
        courseDAO.updateCourse(course);
        System.out.println("Course updated successfully.");
    }

    private static void deleteCourse() throws SQLException {
        System.out.print("Enter Course ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        courseDAO.deleteCourse(id);
        System.out.println("Course deleted successfully.");
    }

    private static void addStudent() throws SQLException {
        System.out.print("Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Course ID: ");
        int courseId = Integer.parseInt(scanner.nextLine());

        Student student = new Student(name, email, courseId);
        studentDAO.addStudent(student);
        System.out.println("Student added successfully.");
    }

    private static void viewStudents() throws SQLException {
        List<Student> students = studentDAO.getAllStudents();
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    private static void updateStudent() throws SQLException {
        System.out.print("Enter Student ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("New Student Name: ");
        String name = scanner.nextLine();
        System.out.print("New Email: ");
        String email = scanner.nextLine();
        System.out.print("New Course ID: ");
        int courseId = Integer.parseInt(scanner.nextLine());

        Student student = new Student(id, name, email, courseId);
        studentDAO.updateStudent(student);
        System.out.println("Student updated successfully.");
    }

    private static void deleteStudent() throws SQLException {
        System.out.print("Enter Student ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        studentDAO.deleteStudent(id);
        System.out.println("Student deleted successfully.");
    }
}
