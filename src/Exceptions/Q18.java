package Exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Q18 {
	public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql//http://");
        } catch (SQLException e) {
            System.out.println("Caught SQLException: " + e.getMessage());
        }
    }
}
