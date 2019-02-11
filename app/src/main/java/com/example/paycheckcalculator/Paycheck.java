package com.example.paycheckcalculator;

public class Paycheck {
    private double hours;
    private double rate;
    private double ot = 1.5;

    // Create a constructor for the Paycheck class
    public Paycheck(double hours, double rate){
        this.hours = hours;
        this.rate = rate;
    } // end Paycheck()

    public double calcGross(){

        if (hours > 40) {
            return (40 * rate) + ((hours - 40) * (rate * ot));
        } else {
            return hours * rate;
        } // end if / else
    } // end calcGross()
} // end Paycheck
