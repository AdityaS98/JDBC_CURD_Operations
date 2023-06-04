package com.jdbcAddressbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddressbookOperations {
    public static void main(String[] args) throws SQLException {

        //conncetions
        String url = "jdbc:mysql://localhost:3306/addressbook_db";
        String username = "root";
        String password = "Aditya@226008";
        try (Connection connection = DriverManager.getConnection(url, username, password)) {

            //Create

            try (Statement statement = connection.createStatement()) {
                String createTableQuery = "create table adress_details(id int primary key,name varchar(20),age int, PhoneNumber varchar(20) , Email varchar(50))";
                statement.executeUpdate(createTableQuery);
                System.out.println("Table is created ");
            }


        }
    }
}



















