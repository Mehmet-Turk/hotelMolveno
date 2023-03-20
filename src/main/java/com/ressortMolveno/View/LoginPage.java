package com.ressortMolveno.View;

import com.ressortMolveno.Model.AccountList;

import java.util.Scanner;

public class LoginPage {
    public String userName;
    public  String password;
    public static void login(){
        Scanner scan = new Scanner(System.in);
        System.out.print("User Name: ");
        String userName = scan.nextLine();
        System.out.print("Password: ");
        String password = scan.nextLine();
        /*if (AccountList.accounts.contains(userName)){
            for (int i = 0;i<AccountList.accounts.size();i++) {
                if (AccountList.accounts.indexOf(i).)

            }
        }*/
        MainMenu.execute();
        //this.userName = userName;

    }
}
