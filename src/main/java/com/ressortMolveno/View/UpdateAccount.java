package com.ressortMolveno.View;

import com.ressortMolveno.Model.AccountList;

import java.util.Scanner;

public class ChangeAccount {
    public static void changeAccount() {
        for (int i = 0; i < AccountList.jsonArray.length(); i++) {
            System.out.println("Account Id: " + AccountList.jsonArray.getJSONObject(i).getInt("accountId") +
                    ", " + "First Name: " + AccountList.jsonArray.getJSONObject(i).getString("firstName") +
                    ", " + "Last Name: " + AccountList.jsonArray.getJSONObject(i).getString("lastName") +
                    ", " + "Password: " + AccountList.jsonArray.getJSONObject(i).getString("password") +
                    ", " + "Address: " + AccountList.jsonArray.getJSONObject(i).getString("address") +
                    ", " + "Phone Number: " + AccountList.jsonArray.getJSONObject(i).getString("phoneNumber") +
                    ", " + "Email address: " + AccountList.jsonArray.getJSONObject(i).getString("e_mail") +
                    ", " + "Role" + AccountList.jsonArray.getJSONObject(i).getString("role") +
                    ", " + "Hotel Guest: " + AccountList.jsonArray.getJSONObject(i).getBoolean("hotelGuest"));

        }
        System.out.println();
        System.out.println("Please enter account id to make updates");
        Scanner scanner = new Scanner(System.in);
        int accountId = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < AccountList.jsonArray.length(); i++) {
            if (accountId == AccountList.jsonArray.getJSONObject(i).getInt("accountId")) {
                String part = "";
                boolean loop = true;
                while (loop){
                    System.out.println("Please enter which information you want to update: first name, last name, " +
                            "password, address, email address or role");
                part = scanner.nextLine();
                    switch (part) {
                        case "first name":
                            part = "firstName";
                            loop = false;
                            break;
                        case "last name":
                            part = "lastName";
                            loop = false;
                            break;
                        case "password":
                            loop = false;
                            break;
                        case "address":
                            loop = false;
                            break;
                        case "email address":
                            part = "e_mail";
                            loop = false;
                            break;
                        default:
                            System.out.println("Please enter at which information you want to update as shown. ");

                    }}
                System.out.println("Please enter new information");

                String newInfo = scanner.nextLine();
                AccountList.jsonArray.getJSONObject(i).put(part, newInfo);
                AccountList.write(AccountList.jsonArray);
                System.out.println("Account Id: " + AccountList.jsonArray.getJSONObject(i).getInt("accountId") +
                        ", " + "First Name: " + AccountList.jsonArray.getJSONObject(i).getString("firstName") +
                        ", " + "Last Name: " + AccountList.jsonArray.getJSONObject(i).getString("lastName") +
                        ", " + "Password: " + AccountList.jsonArray.getJSONObject(i).getString("password") +
                        ", " + "Address: " + AccountList.jsonArray.getJSONObject(i).getString("address") +
                        ", " + "Phone Number: " + AccountList.jsonArray.getJSONObject(i).getString("phoneNumber") +
                        ", " + "Email address: " + AccountList.jsonArray.getJSONObject(i).getString("e_mail") +
                        ", " + "Role" + AccountList.jsonArray.getJSONObject(i).getString("role") +
                        ", " + "Hotel Guest: " + AccountList.jsonArray.getJSONObject(i).getBoolean("hotelGuest"));
            }
        }


    }
}
