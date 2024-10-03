package com.example.Pertemuan7;

public class Airplane extends Vehicle implements Flyable {
    int capacity;

    // Constructor
    public Airplane(String name, int speed, int capacity) {
        super(name, speed);
        this.capacity = capacity;
    }

    // Implementing getCapacity method
    @Override
    int getCapacity() {
        return capacity;
    }

    // Implementing fly method from Flyable interface
    @Override
    public void fly() {
        System.out.println(name + " is flying at " + speed + " km/h.");
    }
}
