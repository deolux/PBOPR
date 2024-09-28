package com.example.Pertemuan6.Soal1;

/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle { // Save as "Circle.java"
    // private instance variables
    private double radius;
    private String color;

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
        this.radius = 1.0;
        this.color = "red";
    }

    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) { // 2nd constructor
        this.radius = r;
        this.color = "red";
    }

    /** Constructs a Circle instance with the given radius and color */
    public Circle(double r, String c) { // 3rd constructor
        this.radius = r;
        this.color = c;
    }

    /** Returns the radius */
    public double getRadius() {
        return radius;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Returns the color */
    public String getColor() {
        return color;
    }

    /** Sets a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Return a self-descriptive string of this instance in the form of Circle[radius=?,color=?] */
    @Override
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}
