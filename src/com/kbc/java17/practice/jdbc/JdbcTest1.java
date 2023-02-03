package com.kbc.java17.practice.jdbc;

import java.sql.DriverManager;

public class JdbcTest1 {
    public static void main(String[] args) {
        var sql = "UPDATE food SET amount = amount + 1";
        try (var conn = DriverManager.getConnection("jdbc:hsqldb:file:zoo");
             var ps = conn.prepareStatement(sql)) {

            var result = ps.executeUpdate();
            System.out.println(result);
        }
    }
}