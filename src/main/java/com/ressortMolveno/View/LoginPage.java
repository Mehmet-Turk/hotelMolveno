package com.ressortMolveno.View;

import com.ressortMolveno.Model.AccountList;


import java.util.Scanner;



public class LoginPage {
    public String userName;
    public String password;
    private static int index = 0;

    public static void login() {
        System.out.println();
        System.out.println("LOGIN");
        System.out.println();
        userNameCheck();
        passwordCheck();

    }

    public static void userNameCheck() {
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        while (true) {
            System.out.print("e-mail: ");
            String e_mail = scan.nextLine();
            for (int i = 0; i < AccountList.jsonArray.length(); i++) {
                if (AccountList.jsonArray.getJSONObject(i).getString("e_mail").equals(e_mail)) {
                    index = i;


                //loop = false;
                    return;
            }



        }
            System.out.println("Wrong e-mail address. Please try again!");

    }


}

    public static void passwordCheck() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("password: ");
            String password = scan.nextLine();
                if (AccountList.jsonArray.getJSONObject(index).getString("password").equals(password)) {
                    System.out.println();
                    System.out.println("Welcome " +
                            AccountList.jsonArray.getJSONObject(index).getString("firstName"));
                    System.out.println();
                    return;
                    //loop = false;
                }


            System.out.println("Wrong password. Please try again!");
        }
    }
    public static void emailSend(){
        Scanner scan = new Scanner(System.in);
        System.out.println("email: ");
        String email = scan.nextLine();


    }
}
