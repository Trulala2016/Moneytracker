package com.example.user.moneytracker;


/**
 * Created by User on 04.08.2016.
 */
public class Transactions {
    public String title;
    public int sum;
    public String date;

    public Transactions(String title, int sum, String ddd) {
        this.title = title;
        this.sum = sum;
        this.date = ddd;
    }
}
