package org.example;
import java.sql.*;

public class DatabaseManager {

    static Connection con;

    static {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/accounts", "root", "" );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getData() throws SQLException {
        PreparedStatement st = con.prepareStatement("SELECT * FROM users");
        ResultSet set = st.executeQuery();

        while (set.next()) {
            System.out.print("id:" + set.getInt("id") + " ");
            System.out.print("jméno:" + set.getString("name") + " ");
            System.out.print("přijmení:" + set.getString("surname") + " ");
            System.out.println("věk:" + set.getInt("age") + " ");
            System.out.println();
        }
    }

    public static void setData(String name, String surname, Integer age) throws SQLException {
        PreparedStatement st = con.prepareStatement("INSERT INTO users VALUES (NULL, ?, ?, ?)");
        st.setString(1, name);
        st.setString(2, surname);
        st.setInt(3, age);
        st.execute();
    }

    public static void deleteData(String name, String surname) throws SQLException {
        PreparedStatement st = con.prepareStatement("DELETE FROM users Where name = ? AND surname = ?");
        st.setString(1, name);
        st.setString(2, surname);
        st.execute();
    }
}
