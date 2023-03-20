package com.ressortMolveno.View;

import java.util.Scanner;

public class Boats {
    public static void execute() {
        boolean exit = true;
        while (exit) {
            System.out.println("\t\t Boats");
            System.out.println("1- Add");
            System.out.println("2- Delete");
            System.out.println("9- Exit");
            System.out.println();
            Scanner scan = new Scanner(System.in);
            String choice = scan.nextLine();
            switch (choice.charAt(0)) {
                case '1':
                    break;
                case '2':
                    break;
                case '3':
                    break;
                case '4':
                    break;
                case '9':
                    exit = false;
                    break;
                default:
                    System.out.println("Invalid number, please choose a valid number...");

            }
        }
    }
    }
