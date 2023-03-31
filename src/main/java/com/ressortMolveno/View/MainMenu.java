package com.ressortMolveno.View;

import com.ressortMolveno.Model.AccountList;

import java.util.Scanner;

public class MainMenu {
    public static char execute() {
        String choice ="";
        boolean cont= true;
//        while (cont) {
            System.out.println("\t\t Main Menu");
            System.out.println("1- Account");
            System.out.println("2- Reservation");
            System.out.println("3- Boats");
            System.out.println("4- Discount");
            System.out.println("9- Exit");
            System.out.println();
            Scanner scan = new Scanner(System.in);
            choice = scan.nextLine();
            return choice.charAt(0);
    }
}
