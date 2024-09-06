package org.example;

import java.sql.SQLException;
import java.util.Scanner;

public class Manager {
    static Scanner sc = new Scanner(System.in);

    public static void addUser() throws SQLException {
        System.out.println("Zadejte jméno");
        String name = sc.nextLine();
        System.out.println("Zadejte příjmení");
        String surname = sc.nextLine();
        System.out.println("Zadejte věk");
        int age = sc.nextInt();

        DatabaseManager.setData(name, surname, age);

        System.out.println("Data se uložila \n");
        sc.nextLine();
    }

    public static void deleteUser() throws SQLException {
        System.out.println("Zadejte jméno uživatele");
        String name = sc.nextLine();

        DatabaseManager.deleteData(name);
        System.out.println("Uživatel byl smazán");
    }

    public static void getAllUsers()  {
        try {
            DatabaseManager.getData();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void quit() {
        System.exit(0);
    }
}
