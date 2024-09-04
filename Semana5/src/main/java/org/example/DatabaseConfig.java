package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {

    private final String url;

    private final String user;

    private final String passaword;

    private Connection connection;

    public DatabaseConfig(String url, String user, String passaword) {
        this.url = url;
        this.user = user;
        this.passaword = passaword;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,passaword);
    }}
