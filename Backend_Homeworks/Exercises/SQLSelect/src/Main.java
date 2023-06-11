
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "123";
    
    public static void main(String[] args) {
        
        Connection connect = null;
        String sql = "select * from student";
        
        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement st = connect.createStatement();
            ResultSet data = st.executeQuery(sql);
            
            // data.next() fonksiyon çağrıldığında bir sonraki satıra ilerler. Böylece o satır üzerinde okuma yapabilmeyi sağlar. Okunacak kayıt kalmadığında “false” döner.
            // data.first() fonksiyonu çağrıldığında sorgu sonucu kümesindeki İLK elemana erişim sağlar.
            // data.last() fonksiyonu çağrıldığında sorgu sonucu kümesindeki SON elemana erişim sağlar.
            // data.absolute() fonksiyonu ile sorgu sonuç kümesindeki direkt olarak istenilen eleman işaret edilir.
            
            while (data.next()) {                
                System.out.println("ID  : " + data.getInt("student_id"));
                System.out.println("Name: " + data.getString("student_name"));
                System.out.println("");
            }
            
            
            st = connect.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            data = st.executeQuery(sql);
            
            data.first();
            System.out.println("First Data" );
            System.out.println("ID: " + data.getInt("student_id") + "\tName: " + data.getString("student_name"));
            
            data.last();
            System.out.println("Last Data");
            System.out.println("ID: " + data.getInt("student_id") + "\tName: " + data.getString("student_name"));
            
            data.absolute(2);
            System.out.println("Row 2");
            System.out.println("ID: " + data.getInt("student_id") + "\tName: " + data.getString("student_name"));
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
