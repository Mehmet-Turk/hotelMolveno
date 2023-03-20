package com.ressortMolveno.View;

import com.ressortMolveno.Model.Account;
import com.ressortMolveno.Model.AccountList;

import java.util.Scanner;

public class CreateAccount {
    static Account account = new Account(200);
    public static void createAccount(){
        System.out.println();
        System.out.println("Create your Molveno Resort Account");
        System.out.println();
        System.out.print("First Name: ");
        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine();
        account.setFirstName(firstName);
        System.out.print("Last Name: ");
        String lastName = scan.nextLine();
        account.setLastName(lastName);
        System.out.print("e-mail/user name address: ");
        String email = scan.nextLine();
        account.setE_mail(email);
        System.out.print("Password: ");
        String password = scan.nextLine();
        account.setPassword(password);
        System.out.print("Confirm Password : ");
        String conformation = scan.nextLine();
        //if (password.equals(conformation))
        System.out.print("Address: ");
        String address = scan.nextLine();
        account.setAddress(address);
        System.out.print("Phone number: ");
        String phone = scan.nextLine();
        account.setPhoneNumber(phone);
        System.out.print("Room Number: ");
        String roomNumber = scan.nextLine();
        account.setRoomNumber(roomNumber);

        System.out.println(account.getAddress());


    }
}
