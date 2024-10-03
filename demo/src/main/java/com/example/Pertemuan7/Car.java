package com.example.Pertemuan7;

// Car class implements Drivable interface and extends Vehicle
public class Car extends Vehicle implements Drivable {
    int capacity;

    // Constructor
    public Car(String name, int speed, int capacity) {
        super(name, speed);
        this.capacity = capacity;
    }

    // Implementing getCapacity method
    @Override
    int getCapacity() {
        return capacity;
    }

    // Implementing drive method from Drivable interface
    @Override
    public void drive() {
        System.out.println(name + " is driving at " + speed + " km/h.");
    }
}
