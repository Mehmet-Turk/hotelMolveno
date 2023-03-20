package com.ressortMolveno.View;

import java.util.Scanner;

public class FirstPage {
    public static void execute() {
        boolean cont = true;
        while (cont) {
            System.out.println("\t\t Welcome to Molveno Resort");
            System.out.println("Do you have an account?");
            System.out.println("1- Login");
            System.out.println("2- Create an account");
            System.out.println("9- Exit");
            System.out.println();
            Scanner scan = new Scanner(System.in);
            String choice = scan.nextLine();
            switch (choice.charAt(0)) {
                case '1':
                    LoginPage.login();
                    break;
                case '2':
                    CreateAccount.createAccount();
                    break;
                case '9':
                    cont = false;
                    break;
                default:
                    System.out.println("Invalid number, please choose a valid number...");

            }
        }
    }}