package com.example.paycheckcalculator;

public class Paycheck {
    private double hours;
    private double rate;

    // Create a constructor for the Paycheck class
    public Paycheck(double hours, double rate){
        this.hours = hours;
        this.rate = rate;
    } // end Paycheck()

    public double calcGross(){
        return hours * rate;
    } // end calcGross()
} // end Paycheck
