package conexion;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.nio.file.Files;
// librerias para manejo de conexion a bd
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.nio.file.Paths;

public class CreateConnection { 
    static Properties config = new Properties();
    String hostname = null;
    String port = null;
    String database =null;
    String username = null;
    String password = null;
    
    public CreateConnection(){
        InputStream in = null;
        String path = "C:\\Users\\panba\\OneDrive\\Documentos\\UMG\\Semestre 3\\Progra I\\Restaurant_Project\\src\\conexion\\localconfig.properties";
//        String path = "C:\\Users\\Carmen y Vanessa\\Documents\\NetBeansProjects\\Restaurant_Project\\src\\conexion\\config.properties";
//        String path = "E:\\Pablo_Bailey_Lenovo\\Documents\\NetBeansProjects\\Restaurant_Project_\\src\\conexion\\config.properties";
//        String path = "D:\\Usuario\\Documents\\NetBeansProjects\\Restaurant_Project\\src\\conexion\\config.properties";
        try {
            in = Files.newInputStream(Paths.get(path));
            config.load(in);
            in.close();
            // Invocar un método para leer la llave y valor
            // y asignarlo a las variables globales
            
            loadProperties();
        } catch (IOException ex)  {
            System.out.println(ex.getMessage());
        }
    }
    
    public void loadProperties(){
        this.hostname = config.getProperty("hostname");
        this.port= config.getProperty("port");
        this.database= config.getProperty("database");
        this.username = config.getProperty("username");
        this.password = config.getProperty("password");
    }
    
    public Connection getConnection() throws SQLException{
        Connection conn = null;
    
        String jdbcUrl = "jdbc:postgresql://"+hostname+":"+port+"/"+database;
        conn = DriverManager.getConnection(jdbcUrl,username,password);
        System.out.println("Conexion establecida");
        return conn;
    } 
}