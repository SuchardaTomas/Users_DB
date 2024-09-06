package org.example;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);

            while (true) {

                    System.out.println("Správa uživatelů: \n1. Přidat uživatele \n2.Odstranit uživatele  \n3. Vypsat všechny uživatele \n4. Konec");
                    int answer = sc.nextInt();

                    switch (answer) {
                        case 1 -> Manager.addUser();
                        case 2 -> Manager.deleteUser();
                        case 3 -> Manager.getAllUsers();
                        case 4 -> Manager.quit();
                        default -> System.out.println("Neplatná volba");
                    }
            }

    }
}