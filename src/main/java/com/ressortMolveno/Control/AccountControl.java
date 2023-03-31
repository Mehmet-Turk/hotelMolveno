package com.ressortMolveno.Control;

import com.ressortMolveno.Model.AccountList;
import com.ressortMolveno.View.*;
import org.json.JSONArray;

import java.util.Scanner;
import java.util.regex.Pattern;

public class AccountControl {


    public static void execute(){
        //AccountList.jsonArray = AccountList.read();
        //System.out.println(AccountList.jsonArray.getJSONObject(0).getString("firstName"));
        boolean exit = true;
        while (exit){
            switch (AccountsMenu.execute()){
                case 1:
                    AccountList.addToJsoNArray(CreateAccount.createAccount());
                    //AccountList.write(AccountList.jsonArray);//toDO enson yazdirma olarak degistir
                    //AccountList.accounts.add(CreateAccount.createAccount());
                    //LoginPage.login();
                    break;
                case 2:
                    UpdateAccount.changeAccount();
                    break;
                case 3:
                    ViewAccounts.viewAccount();
                    break;
                case 4:
                    DeleteAccount.deleteAccount();
                    break;
                case 9:
                    //AccountList.write(AccountList.jsonArray);//toDo
                    exit = false;
                    break;
                default:
                    System.out.println("Invalid number, please choose a valid number...");
            }
        }
    }

}
