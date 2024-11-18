package ReproductorFormulario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBconexion {

    private static final String URL = "jdbc:mysql://localhost:3306/cancionesdemo?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection conectarMySQL() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        if (conectarMySQL() != null) {
            System.out.println("Conexión exitosa.");
        } else {
            System.out.println("Error al conectar.");
        }
    }

}
