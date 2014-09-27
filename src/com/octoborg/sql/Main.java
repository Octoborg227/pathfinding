package com.octoborg.sql;

import java.sql.*;

/**
 * Created by Octoborg on 9/25/14.
 */
public class Main {


    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/databasename?"+
                            "user=root&password=password");
            Statement statement = conn.createStatement();
            //ResultSet res = statement.executeQuery("select 42 from dual");
            //System.out.println(res.getMetaData().getColumnName(1));

            // TODO ADD INSERTION STATEMENT
            String query = "INSERT INTO REGISTRATION values (12345678, 'Mister', 'Dude', 25)";
            // statement.executeUpdate(query);

            query = "SELECT * from REGISTRATION";
            ResultSet res = statement.executeQuery(query);
            while(res.next()) {
                System.out.println(res.getInt("id"));
                System.out.println(res.getString("first"));
                System.out.println(res.getString("last"));
                System.out.println(res.getInt("age"));
            }


        } catch (Exception ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
    }
}
