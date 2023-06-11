
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect_2 {
    
    public static final String DB_URL = "jdbc:mysql://localhosy/university";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "123";
    
    public static void main(String[] args) {
        
        Connection connect = null;
        
        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
    }
}
