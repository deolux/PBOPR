package com.example.Pertemuan8.StudiKasus2;

public class Paint {
    private double coverage; // Amount of area covered by one gallon of paint

    public Paint(double coverage) {
        this.coverage = coverage;
    }

    public double amount(Shape s) {
        System.out.println("Computing amount of paint for " + s);
        return s.area() / coverage; // Amount of paint needed is area divided by coverage
    }
}

