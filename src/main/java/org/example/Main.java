package org.example;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean loop = false;

        try {
            while (loop == false) {
                    DatabaseManager.getData();

                    System.out.println("\nBudete chtít přidat nového uživatele? (ano/ne)");
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
                            System.out.println("Data se uložila \n");
                            sc.nextLine();
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