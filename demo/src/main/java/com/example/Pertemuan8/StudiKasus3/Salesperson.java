package com.example.Pertemuan8.StudiKasus3;

public class Salesperson implements Comparable<Salesperson> {
    private String firstName;
    private String lastName;
    private int totalSales;

    public Salesperson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    public int compareTo(Salesperson other) {
        if (this.totalSales != other.totalSales) {
            return other.totalSales - this.totalSales; // Descending order of sales
        } else {
            return other.lastName.compareTo(this.lastName); // Reverse alphabetical order if sales are equal
        }
    }

    public String toString() {
        return lastName + ", " + firstName + ": " + totalSales;
    }
}

