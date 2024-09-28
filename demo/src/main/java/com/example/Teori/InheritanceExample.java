package com.example.Teori;
// Kelas induk (Parent Class)
class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void honk() {
        System.out.println(brand + " makes a honk sound!");
    }
}

// Kelas turunan (Child Class) mewarisi dari Vehicle
class Car extends Vehicle {
    private String model;

    public Car(String brand, String model) {
        super(brand); // Memanggil constructor kelas induk
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Car brand: " + brand + ", Model: " + model);
    }
}

// Kelas turunan lain (Child Class) mewarisi dari Vehicle
class Motorcycle extends Vehicle {
    private int engineCapacity;

    public Motorcycle(String brand, int engineCapacity) {
        super(brand); // Memanggil constructor kelas induk
        this.engineCapacity = engineCapacity;
    }

    public void displayInfo() {
        System.out.println("Motorcycle brand: " + brand + ", Engine capacity: " + engineCapacity + "cc");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Membuat objek Car (kelas turunan dari Vehicle)
        Car myCar = new Car("Toyota", "Corolla");
        myCar.honk();  // Memanggil metode dari kelas induk
        myCar.displayInfo();  // Memanggil metode dari kelas Car

        // Membuat objek Motorcycle (kelas turunan dari Vehicle)
        Motorcycle myMotorcycle = new Motorcycle("Honda", 150);
        myMotorcycle.honk();  // Memanggil metode dari kelas induk
        myMotorcycle.displayInfo();  // Memanggil metode dari kelas Motorcycle
    }
}

