package Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {

    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection != null) {
            return connection;
        } else {
            try {
                // Load the JDBC driver
                Class.forName("oracle.jdbc.drive.OracleDriver");

                System.out.println("Driver loaded");

                String userName = "LAURA-1121";
                String password = "1037645287";

                String url = "jdbc:oracle:thin:@localhost:1521:XE";
                 connection = DriverManager.getConnection(url, userName, password);
                 System.out.println("conectado");
            } catch (Exception ex) {
                System.out.println(ex);
                  System.out.println("no conectado");
            }
            return connection;
        }

    }
}
