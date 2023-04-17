package com.kbc.java17.practice.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;

public class JdbcTest2 {
    public static void main(String[] args) throws Exception{
        try (var sql = "{call learn (?)}";
             var conn = DriverManager.getConnection("");
             var cs = conn.prepareCall(sql,
                          ResultSet.TYPE_SCROLL_SENSITIVE);
             cs.setInt(1, 8);
             var rs = cs.execute()) {

                while (rs.hasNext()) {
                       System.out.println( rs.getString(3));
                    }
             }

    }
}