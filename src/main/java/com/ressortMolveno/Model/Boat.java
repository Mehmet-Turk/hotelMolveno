package com.ressortMolveno.Model;

public class Boat {
    private int boatId;
    private String boatType;
    private int price;
    private int seats;
    private static int minimumRentTime = 30;
    private int chargingTime;
    private int duration;
    public Boat(int boatId){
        this.boatId= boatId;
    }
}
