package com.ressortMolveno.View;

import com.ressortMolveno.Model.AccountList;

import java.util.Scanner;

public class AccountsMenu {
    public static String create;
    public static String update;
    public static String delete;
    public  static String exit;
    public static int execute() {
        String choice = "";

            System.out.println("\t\t Accounts Menu");
            System.out.println("1- Create");
            System.out.println("2- Update");
            System.out.println("3- View");
            System.out.println("4- Delete");
            System.out.println("9- Exit");
            System.out.println();
            Scanner scan = new Scanner(System.in);
            choice = scan.nextLine();



        return Integer.parseInt(choice.charAt(0)+ "");
    }}


