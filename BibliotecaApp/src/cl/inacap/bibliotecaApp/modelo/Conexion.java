package cl.inacap.bibliotecaApp.modelo;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 * Clase Conexion: se establece la conexion con la base de datos mediante
 * DriverManager de SQL indicando la url, el usuario y contraseña de la base de
 * datos
 */
public class Conexion {

    String url = "jdbc:mysql://localhost:3306/mydb";
    String user = "root", pass = "";
    Connection con;

    public Connection getConnection() { //.cj x la nueva extencion
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
        }
        return con;
    }
}
