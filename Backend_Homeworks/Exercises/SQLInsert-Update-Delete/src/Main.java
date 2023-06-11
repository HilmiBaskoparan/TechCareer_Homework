
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "123";
    
    public static void main(String[] args) {
        
        Connection conn = null;
        Statement st = null;
        
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            st = conn.createStatement();
            
            // Insert with Statement
            String sql = "INSERT INTO student (student_id, student_name, student_class) VALUES (9999, 'Barış Manço', 1)";
            st.executeUpdate(sql);
            
            // Insert with PreparedStatement
            PreparedStatement pr = conn.prepareStatement("INSERT INTO student (student_id,student_name,student_class) VALUES (?,?,?)");
            pr.setInt(1, 5555);
            pr.setString(2, "Harry Potter");
            pr.setInt(3, 2);
            pr.executeUpdate();
            
            // #####################################################################################
            // Update with Statement
            String updateQuery = "UPDATE student SET student_id = 5100  WHERE student_id = 9999";
            st.executeUpdate(updateQuery);
            
            // Update with PreparedStatement
            PreparedStatement pr2 = conn.prepareStatement("UPDATE student SET student_id = ?  WHERE student_id = ?");
            pr2.setInt(1, 5200);
            pr2.setInt(2, 5555);
            pr2.executeUpdate();
            
            // #####################################################################################
            // Delete with Statement
            String deleteQuery = "DELETE FROM student WHERE student_id = 1111";
            st.executeUpdate(deleteQuery);
            
            // Delete with PreparedStatement
            PreparedStatement pr3 = conn.prepareStatement("DELETE FROM student WHERE student_id = ?");
            pr3.setInt(1, 2222);
            pr3.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }
        
        // List the Data
        try {
            String select = "select * from student";
            ResultSet data = st.executeQuery(select);
            while (data.next()) {                
                System.out.println("ID: " + data.getInt("student_id") + "\tName: " + data.getString("student_name") + "\tClass: " + data.getInt("student_class"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
