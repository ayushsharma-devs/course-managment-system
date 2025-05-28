import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseDAO {

    public void addCourse(Course course) throws SQLException {
        String sql = "INSERT INTO courses (course_name, course_instructor, credits) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, course.getCourseName());
            stmt.setString(2, course.getCourseInstructor());
            stmt.setInt(3, course.getCredits());
            stmt.executeUpdate();
        }
    }

    public List<Course> getAllCourses() throws SQLException {
        List<Course> courses = new ArrayList<>();
        String sql = "SELECT * FROM courses";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Course course = new Course(
                    rs.getInt("course_id"),
                    rs.getString("course_name"),
                    rs.getString("course_instructor"),
                    rs.getInt("credits")
                );
                courses.add(course);
            }
        }
        return courses;
    }

    public void updateCourse(Course course) throws SQLException {
        String sql = "UPDATE courses SET course_name = ?, course_instructor = ?, credits = ? WHERE course_id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, course.getCourseName());
            stmt.setString(2, course.getCourseInstructor());
            stmt.setInt(3, course.getCredits());
            stmt.setInt(4, course.getCourseId());
            stmt.executeUpdate();
        }
    }

    public void deleteCourse(int courseId) throws SQLException {
        String sql = "DELETE FROM courses WHERE course_id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, courseId);
            stmt.executeUpdate();
        }
    }
}
