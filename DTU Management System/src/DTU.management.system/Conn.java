package DTU.management.system;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/DTUmanagementsystem", "root", "My@2003raj");
            s = c.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
