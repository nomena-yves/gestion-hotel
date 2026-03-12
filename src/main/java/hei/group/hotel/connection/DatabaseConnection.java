package hei.group.hotel.connection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class DatabaseConnection {
    @Value("${spring.datasource.url}")
    private String URL;
    @Value("${spring.datasource.password")
    private String PASSWORD;
    @Value("${spring.datasource.username}")
    private String USER;

    public Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connexion réussie !");
        } catch (SQLException e) {
            System.out.println("Erreur de connexion");
            System.out.println(e.getMessage());;
        }

        return connection;
    }
}

