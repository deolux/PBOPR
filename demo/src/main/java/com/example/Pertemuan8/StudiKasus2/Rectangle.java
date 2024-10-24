package com.example.Pertemuan8.StudiKasus2;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width; // Area formula for a rectangle
    }

    @Override
    public String toString() {
        return super.toString() + ", Length: " + length + ", Width: " + width;
    }
}

