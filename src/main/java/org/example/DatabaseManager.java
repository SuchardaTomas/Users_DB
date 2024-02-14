package org.example;
import java.sql.*;

public class DatabaseManager {
    public static void getData() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/accounts", "root", "" );
        PreparedStatement st = con.prepareStatement("SELECT * FROM users");
        ResultSet set = st.executeQuery();

        while (set.next()) {
            System.out.print(set.getInt("id") + " ");
            System.out.print(set.getString("name") +" ");
            System.out.print(set.getString("surname") + " ");
            System.out.println(set.getInt("age"));
        }
    }

    public static void setData(String name, String surname, Integer age) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/accounts", "root", "" );
        PreparedStatement st = con.prepareStatement("INSERT INTO users VALUES (NULL, ?, ?, ?)");
        st.setString(1, name);
        st.setString(2, surname);
        st.setInt(3, age);
        st.execute();
    }
}
