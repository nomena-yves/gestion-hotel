package hei.group.hotel.Repository;

import hei.group.hotel.connection.DatabaseConnection;

@org.springframework.stereotype.Repository
public class Repository {
private DatabaseConnection connection;

    public Repository(DatabaseConnection connection) {
        this.connection = connection;
    }
}
