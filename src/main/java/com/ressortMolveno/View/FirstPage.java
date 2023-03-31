package com.ressortMolveno.View;

import java.util.Scanner;

public class FirstPage {
    public static char execute() {
//        boolean cont = true;
//        String choice="";
//        while (cont) {
            System.out.println("\t\t Welcome to Molveno Resort");
            System.out.println("Do you have an account?");
            System.out.println("1- Login");
            System.out.println("2- Create an account");
            System.out.println("9- Exit");
            System.out.println();
            Scanner scan = new Scanner(System.in);
            String choice = scan.nextLine();

        return choice.charAt(0);
        }
}
