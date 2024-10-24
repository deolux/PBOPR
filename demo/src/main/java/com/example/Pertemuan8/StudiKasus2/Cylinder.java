package com.example.Pertemuan8.StudiKasus2;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        return 2 * Math.PI * radius * (radius + height); // Surface area formula for a cylinder
    }

    @Override
    public String toString() {
        return super.toString() + ", Radius: " + radius + ", Height: " + height;
    }
}

