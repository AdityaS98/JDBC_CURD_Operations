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


            //Insert


            try(Statement statement = connection.createStatement()){
                String insertQuery = "insert into adress_details(id,name,age,PhoneNumber,Email) value (1,'Aditya',23,'887613856','aditya@gmail.com'),(2,'Nitish',23,'9705992894','nitish@gmail.com'),(3,'Abhinav',24,'8090229460','abhinav@gmail.com')";
                statement.executeUpdate(insertQuery);
                System.out.println("Values are inserted");
            }



            //Update


            try (Statement statement = connection.createStatement()) {
                String updateQuery = "update adress_details set age = 22 WHERE id = 1";
                statement.executeUpdate(updateQuery);
                System.out.println("Value update successfully");
            }




            //Delete

            try (Statement statement = connection.createStatement()) {
                String deleteQuery = "delete from adress_details WHERE id = 2";
                statement.executeUpdate(deleteQuery);
                System.out.println("Value deleted");

            }


        }
    }
}



















