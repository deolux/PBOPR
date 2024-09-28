package com.example.Pertemuan6.Soal2;
public class Shape {
    // Instance variables
    private String color;
    private boolean filled;

    // No-arg constructor that initializes color to "green" and filled to true
    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    // Constructor that initializes color and filled with given values
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter for filled (isFilled for boolean type)
    public boolean isFilled() {
        return filled;
    }

    // Setter for filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // toString method
    @Override
    public String toString() {
        return "A Shape with color of " + color + " and " + (filled ? "filled" : "Not filled");
    }
}
