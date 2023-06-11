
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "123";
    
    public static void main(String[] args) {
        
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(DB_URL, DB_URL, DB_PASSWORD);
            conn.setAutoCommit(false);
            
             // PreparedStatement ile Insert İşlemi
            PreparedStatement pr = conn.prepareStatement("INSERT INTO student (student_id,student_name,student_class) VALUES (?,?,?)");
            pr.setInt(1, 1001);
            pr.setString(2, "XXXXXXXXXXXXXXXXX");
            pr.setInt(3, 4);
            pr.executeUpdate();

            if (1 == 1) {
                throw new SQLException();
            }

            // PreparedStatement ile Insert İşlemi
            pr.setInt(1, 1002);
            pr.setString(2, "Weasley");
            pr.setInt(3, 4);
            pr.executeUpdate();
            
            conn.commit();
            conn.close();
        } catch (SQLException ex) {
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        
        
    }
}
