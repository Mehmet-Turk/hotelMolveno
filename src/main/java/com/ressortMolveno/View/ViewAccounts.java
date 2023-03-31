package com.ressortMolveno.View;

import com.ressortMolveno.Model.AccountList;

public class ViewAccounts {
    public static void viewAccount(){
        for (int i = 0; i < AccountList.jsonArray.length() ; i++) {
            System.out.println("Account Id: " +AccountList.jsonArray.getJSONObject(i).getInt("accountId")+
                    ", "+ "First Name: " + AccountList.jsonArray.getJSONObject(i).getString("firstName")+
                    ", "+ "Last Name: " + AccountList.jsonArray.getJSONObject(i).getString("lastName")+
                    ", "+ "Password: " + AccountList.jsonArray.getJSONObject(i).getString("password")+
                    ", "+ "Address: " + AccountList.jsonArray.getJSONObject(i).getString("address") +
                    ", "+ "Phone Number: " + AccountList.jsonArray.getJSONObject(i).getString("phoneNumber")+
                    ", "+ "Email address: " + AccountList.jsonArray.getJSONObject(i).getString("e_mail") +
                    ", "+ "Role" + AccountList.jsonArray.getJSONObject(i).getString("role")+
                    ", "+ "Hotel Guest: "+ AccountList.jsonArray.getJSONObject(i).getBoolean("hotelGuest") );

        }

    }
}
