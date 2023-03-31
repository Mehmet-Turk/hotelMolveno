package com.ressortMolveno.Control;

import com.ressortMolveno.Model.AccountList;
import com.ressortMolveno.View.CreateAccount;
import com.ressortMolveno.View.FirstPage;
import com.ressortMolveno.View.LoginPage;

public class FirstControl {
    public static void execute(){
        AccountList.jsonArray = AccountList.read();
        boolean exit = true;
        while(exit) {
            switch (FirstPage.execute()) {
                case '1':
                    LoginPage.login();
                    MainControl.execute();
                    //AccountControl.execute();//uyari
                    exit=false;
                    break;
                case '2':
                    AccountList.addToJsoNArray(CreateAccount.createAccount());
                    //AccountList.write(AccountList.jsonArray);//enson yazdirma olarak degistir
                    LoginPage.login();
                    MainControl.execute();
                    //AccountControl.execute();uyari
                    exit=false;
                    break;
                case '9':
                    AccountList.write(AccountList.jsonArray);//toDo
                    exit = false;
                    break;
                default:
                    System.out.println("Invalid number, please choose a valid number...");

            }
        }
    }
}
