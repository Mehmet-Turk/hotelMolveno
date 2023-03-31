package com.ressortMolveno.View;


import com.ressortMolveno.Model.Account;
import com.ressortMolveno.Model.AccountList;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CreateAccount {

    public static Account createAccount() {
        Account account = new Account();

        System.out.println();
        System.out.println("Create your Molveno Resort Account");
        System.out.println();
        Scanner scan = new Scanner(System.in);
//        System.out.print("Account ID: ");
//        int accountId = scan.nextInt();;
        account.setAccountId(AccountList.nextId());
        //scan.nextLine();
        System.out.print("First Name: ");
        String firstName = scan.nextLine();
        account.setFirstName(firstName);
        System.out.print("Last Name: ");
        String lastName = scan.nextLine();
        account.setLastName(lastName);
//        System.out.print("e-mail/user name: ");
//        String email = scan.nextLine();
        account.setE_mail(emailControl());
        account.setPassword(passwordControl());
//        System.out.print("Confirm Password : ");
//        String conformation = scan.nextLine();
        passwordConformation(account.getPassword());
        System.out.print("Address: ");
        String address = scan.nextLine();
        account.setAddress(address);
//        System.out.print("Phone number: ");
//        String phone = scan.nextLine();
        account.setPhoneNumber(phoneControl());
        System.out.print("Are you a receptionist or client? ");
        String role = scan.nextLine();
        account.setRole(role.toUpperCase());
        boolean guest = true;
        System.out.print(" Are you our guest in Molveno Resort? y/n: ");
        String isGuest = scan.nextLine();
        if (isGuest.charAt(0) == 'y' || isGuest.charAt(0) == 'Y') ;
        else guest = false;
        account.setHotelGuest(guest);
        if (guest) {
            System.out.print("Room Number: ");
            String roomNumber = scan.nextLine();
            account.setRoomNumber(roomNumber);
        }
        //AccountList.addToJsoNArray(account);//@toDO
        //LoginPage.login();
        //AccountList.write(AccountList.jsonArray);
        System.out.println();
        System.out.println("Account created successfully!");
        System.out.println();
        return account;



    }

    public static String passwordControl() {
        Scanner scan = new Scanner(System.in);
        String password = "";
        //(?=.*?[A-Z])(?=.*?[a-z]) upper and lower case
        String passwordRegex = "^(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
        password = password.trim();
        boolean cont = true;
        while (cont) {
            System.out.print("Password: ");
            password = scan.nextLine();
            if (Pattern.compile(passwordRegex).matcher(password).matches())
                cont = false;
            else System.out.println("Password must be minimum eight in length and include " +
                    "at least one special character," +
                    "include at least one digit. ");
        }
        return password;
    }

    public static String emailControl() {
        String email = "";
        Scanner scan = new Scanner(System.in);
        //(?=.*?[A-Z])(?=.*?[a-z]) upper and lower case
        String passwordRegex = "^[a-zA-Z0-9_!#$%&'*+/=?``{|}~^.-]+@[a-zA-Z0-9.-]+$";
        email = email.trim();
        boolean cont = true;
        while (cont) {
            System.out.print("e-mail: ");
            email = scan.nextLine();
            if (Pattern.compile(passwordRegex).matcher(email).matches())
                cont = false;
            else {
                System.out.println();
                System.out.println("E-mail address is incorrect. Please control and enter again");
            }
        }
        return email;
    }

    public static void passwordConformation(String password) {
        Scanner scan = new Scanner(System.in);
        boolean cont = true;
        while (cont) {
            System.out.print("Confirm Password : ");
            String conformation = scan.nextLine();
            if (!password.equals(conformation))
                System.out.println("Password did not match!");
            else cont = false;
        }
    }

    public static String phoneControl() {
        String phone = "";
        Scanner scan = new Scanner(System.in);
        //(?=.*?[A-Z])(?=.*?[a-z]) upper and lower case
        String passwordRegex = "\\d{10}";
        phone = phone.trim();
        boolean cont = true;
        while (cont) {
            System.out.print("Phone number: ");
            phone = scan.nextLine();
            if (Pattern.compile(passwordRegex).matcher(phone).matches())
                cont = false;
            else {
                System.out.println();
                System.out.println("Phone number is incorrect. Please enter only numbers");
            }
        }
        return phone;
    }

}
