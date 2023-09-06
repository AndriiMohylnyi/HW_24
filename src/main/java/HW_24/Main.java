package HW_24;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String select = "Select * from student";

        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "docker");
        Statement statement = connection.createStatement();

        int[] array = new int[3];
        int i = 0;
        ResultSet rs = statement.executeQuery(select);
        while (rs.next()) {
            System.out.println(rs.getString("StudentId") + " " + rs.getString(2) + " " + rs.getString(3)
                    + " " + rs.getString(4) + " " + rs.getString(5));
            int a = rs.getInt("StudentId");
            array[i++] = a;
        }

        connection.close();

    }
}
