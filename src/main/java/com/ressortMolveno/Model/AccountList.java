package com.ressortMolveno.Model;


import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.*;

import java.util.ArrayList;
import java.util.Collections;


public class AccountList {
    public static Account account = new Account();
    public static ArrayList<Account> accounts = new ArrayList<>();
    public static JSONArray jsonArray = new JSONArray();


    public static void write(JSONArray jsonArray){
        try {
            FileWriter file = new FileWriter("account.json");
            file.write(jsonArray.toString(4));
            file.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static int nextId(){
        int nextId = 0;
        ArrayList<Integer> accountID = new ArrayList<Integer>();
        for (int i = 0; i <jsonArray.length() ; i++) {
            accountID.add(jsonArray.getJSONObject(i).getInt("accountId"));

            Collections.sort(accountID, Collections.reverseOrder());

        }
        nextId = accountID.get(0) + 1;
        return nextId;
    }

    public static void addToJsoNArray(Account account) {
        JSONObject accountDetails = new JSONObject();
        
        //Inserting key-value pairs into the json object
        accountDetails.put("accountId", account.getAccountId());
        accountDetails.put("firstName", account.getFirstName());
        accountDetails.put("lastName", account.getLastName());
        accountDetails.put("e_mail", account.getE_mail());
        accountDetails.put("address", account.getAddress());
        accountDetails.put("phoneNumber", account.getPhoneNumber());
        accountDetails.put("roomNumber", account.getRoomNumber());
        accountDetails.put("hotelGuest", account.isHotelGuest());
        accountDetails.put("password", account.getPassword());
        accountDetails.put("role", account.getRole());

        JSONObject accountObject = new JSONObject();
        //accountObject.put("AccountInfo", accountDetails);
        AccountList.jsonArray.put(accountDetails);
    }

    public static JSONArray read(){
        try (FileReader reader = new FileReader("account.json")) {
            JSONTokener tokener = new JSONTokener(reader);
            return new JSONArray(tokener);
            //return jsonArray1;
            //System.out.println(jsonArray1.getJSONObject(0).get("firstName"));
            //return new JSONArray(tokener);
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
            return new JSONArray();
        }
    }
    }
