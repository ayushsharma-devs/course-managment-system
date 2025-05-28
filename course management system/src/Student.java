public class Student {
    private int studentId;
    private String studentName;
    private String email;
    private int courseId;

    public Student(int studentId, String studentName, String email, int courseId) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.email = email;
        this.courseId = courseId;
    }

    public Student(String studentName, String email, int courseId) {
        this.studentName = studentName;
        this.email = email;
        this.courseId = courseId;
    }

    // Getters and setters
    public int getStudentId() { return studentId; }
    public String getStudentName() { return studentName; }
    public String getEmail() { return email; }
    public int getCourseId() { return courseId; }

    public void setStudentId(int studentId) { this.studentId = studentId; }
    public void setStudentName(String studentName) { this.studentName = studentName; }
    public void setEmail(String email) { this.email = email; }
    public void setCourseId(int courseId) { this.courseId = courseId; }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + studentName + ", Email: " + email + ", Course ID: " + courseId;
    }
}
