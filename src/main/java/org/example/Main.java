package org.example;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);
        boolean loop = false;
        DatabaseManager.getData();

    try {
        while (loop == false) {

            System.out.println("Chcete přidat uživatele? (ano/ne)");
            String answer = sc.nextLine();

            switch (answer) {
                case "ano" -> {
                    System.out.println("Zadejte jméno");
                    String name = sc.nextLine();
                    System.out.println("Zadejte příjmení");
                    String surname = sc.nextLine();
                    System.out.println("Zadejte věk");
                    int age = sc.nextInt();
                    DatabaseManager.setData(name, surname, age);
                    sc.nextLine();
                    DatabaseManager.getData();

                }
                case "ne" -> {
                    System.out.println("Program se ukončuje");
                    loop = true;
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }


        }
    }
