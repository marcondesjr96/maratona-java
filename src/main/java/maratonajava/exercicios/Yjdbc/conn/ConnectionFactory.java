package maratonajava.exercicios.Yjdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/anime_store";
        String username = "root";
        String password = "Jr884360246991";
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
