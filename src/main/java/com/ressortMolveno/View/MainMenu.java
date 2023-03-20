package com.ressortMolveno.View;

import java.util.Scanner;

public class MainMenu {
    public static void execute() {
        boolean cont= true;
        while (cont) {
            System.out.println("\t\t Main Menu");
            System.out.println("1- Reservations");
            System.out.println("2- Accounts");
            System.out.println("3- Boats");
            System.out.println("4- Clients");
            System.out.println("9- Exit");
            System.out.println();
            Scanner scan = new Scanner(System.in);
            String choice = scan.nextLine();
            switch (choice.charAt(0)) {
                case '1':
                    ReservationsMenu.execute();
                    break;
                case '2':
                    AccountsMenu.execute();
                    break;
                case '3':
                    Boats.execute();
                    break;
                case '4':
                    ClientsMenu.execute();
                    break;
                case '9':
                    cont = false;
                    break;
                default:
                    System.out.println("Invalid number, please choose a valid number...");

            }
        }
    }
}
