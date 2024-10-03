package com.example.Pertemuan7;
// Interface for Drivable
interface Drivable {
    void drive();
}

// Interface for Flyable
interface Flyable {
    void fly();
}

abstract class Vehicle {
    String name;
    int speed;

    // Constructor
    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    // Abstract method for capacity
    abstract int getCapacity();
    
    // Method to display vehicle information
    public void showInfo() {
        System.out.println("Vehicle Name: " + name);
        System.out.println("Speed: " + speed + " km/h");
    }
}