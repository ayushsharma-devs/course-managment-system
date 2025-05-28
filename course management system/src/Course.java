public class Course {
    private int courseId;
    private String courseName;
    private String courseInstructor;
    private int credits;

    public Course(int courseId, String courseName, String courseInstructor, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseInstructor = courseInstructor;
        this.credits = credits;
    }

    public Course(String courseName, String courseInstructor, int credits) {
        this.courseName = courseName;
        this.courseInstructor = courseInstructor;
        this.credits = credits;
    }

    // Getters and setters
    public int getCourseId() { return courseId; }
    public String getCourseName() { return courseName; }
    public String getCourseInstructor() { return courseInstructor; }
    public int getCredits() { return credits; }

    public void setCourseId(int courseId) { this.courseId = courseId; }
    public void setCourseName(String courseName) { this.courseName = courseName; }
    public void setCourseInstructor(String courseInstructor) { this.courseInstructor = courseInstructor; }
    public void setCredits(int credits) { this.credits = credits; }

    @Override
    public String toString() {
        return "Course ID: " + courseId + ", Name: " + courseName + ", Instructor: " + courseInstructor + ", Credits: " + credits;
    }
}
