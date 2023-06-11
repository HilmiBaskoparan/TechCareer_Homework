
import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnect {
    public static void main(String[] args) {
        
        Connection connect = null;
        String url = "jdbc:mysql://localhost/university?username=root?password=123";
        
        try {
            connect = DriverManager.getConnection(url);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
