package com.example.Pertemuan6.Soal3;

import java.util.Calendar;
import java.util.GregorianCalendar;

// Manager class extending Employee
class Manager extends Employee {
    private String secretaryName;

    public Manager(String n, double s, int d, int m, int y) {
        super(n, s, d, m, y);
        secretaryName = "";
    }

    // Override raiseSalary to include a bonus for years of service
    @Override
    public void raiseSalary(double byPercent) {
        // Add 1/2% bonus for every year of service
        GregorianCalendar todaysDate = new GregorianCalendar();
        int currentYear = todaysDate.get(Calendar.YEAR);
        double bonus = 0.5 * (currentYear - hireYear());
        super.raiseSalary(byPercent + bonus);
    }

    public String getSecretaryName() {
        return secretaryName;
    }

    // Override toString for better output readability
    @Override
    public String toString() {
        return "Manager: " + super.toString();
    }
}


