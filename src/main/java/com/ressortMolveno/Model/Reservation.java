package com.ressortMolveno.Model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reservation {
    private int reservationId;
    private Boat boat;
    private Account account;
    private LocalTime startTime;
    private LocalTime endTime;
    private LocalDate date;

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public  Reservation(int reservationId, Boat boat, Account account){
        this.account = account;
        this.boat = boat;
        this.reservationId = reservationId;
    }


}
