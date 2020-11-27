

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class connection {
    Connection con;
    public static Connection connected(){
        Connection con1;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/registration","root","");
            //System.out.println("connected");
         return con1;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex); 
            return null;
   }
    }
}
