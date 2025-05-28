import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/course_management";
    private static final String USER = "root"; // your MySQL username
    private static final String PASSWORD = "kiit123"; // your MySQL password
    
    public static Connection getConnection() throws SQLException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        


        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
