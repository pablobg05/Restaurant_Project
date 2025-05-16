package conexion;

import java.sql.SQLException;

public class Conexion {

    public static void main(String[] args) throws SQLException {
       CreateConnection cn = new CreateConnection ();       
       cn.getConnection();
    }
    
}
