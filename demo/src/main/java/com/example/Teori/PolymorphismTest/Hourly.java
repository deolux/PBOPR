package com.example.Teori.PolymorphismTest;

public class Hourly extends Employee {
    private int hoursWorked;
    public Hourly (String eName, String eAddress, String ePhone, String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        hoursWorked = 0;
    }

    public void addHours (int moreHours)
    {
        hoursWorked += moreHours;
    }
    @Override
    public double pay()
    {
        double payment = payRate + hoursWorked;
        hoursWorked = 0;
        return payment;
    }
    @Override
    public String toString()
    {
        String result = super.toString();
        result += "\nCurrent Hours: " + hoursWorked;
        hoursWorked = 0;
        return result;
    }
    
}