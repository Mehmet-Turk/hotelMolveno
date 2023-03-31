package com.ressortMolveno.View;

import com.ressortMolveno.Model.AccountList;

import java.util.Scanner;

public class DeleteAccount {
    public static void deleteAccount() {
        int accountId = 0;
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
        System.out.println("Please enter account id to delete");
        Scanner scanner = new Scanner(System.in);
        accountId = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < AccountList.jsonArray.length(); i++) {
            if (accountId == AccountList.jsonArray.getJSONObject(i).getInt("accountId")) {
                AccountList.jsonArray.remove(i);
            }

        }
        //AccountList.write(AccountList.jsonArray);//toDO
        ViewAccounts.viewAccount();
        System.out.println();
    }
}
