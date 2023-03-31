package com.ressortMolveno.Control;

import com.ressortMolveno.Model.AccountList;
import com.ressortMolveno.View.MainMenu;

public class MainControl {
    public static void execute(){
        boolean exit = true;
        while(exit) {
            switch (MainMenu.execute()) {
                case '1':
                    AccountControl.execute();
//                    LoginPage.login();
//                    AccountControl.execute();
                    break;
                case '2':
                    ReservationControl.execute();
                    //AccountList.addToJsoNArray(CreateAccount.createAccount());//toDO
                    //AccountList.write(AccountList.jsonArray);//enson yazdirma olarak degistir
//                    LoginPage.login();
//                    AccountControl.execute();//toDo
                    break;
                case '3':
                    BoatControl.execute();
                    break;
                case '4':
                    DiscountControl.execute();
                    break;
                case '9':
                    AccountList.write(AccountList.jsonArray);
                    exit = false;
                    break;
                default:
                    System.out.println("Invalid number, please choose a valid number...");

            }
        }
    }
}
