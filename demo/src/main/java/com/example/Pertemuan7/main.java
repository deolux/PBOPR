package com.example.Pertemuan7;

public class main{
    public static void main(String[] args) {
        // Creating instances of Car and Airplane
        Car car = new Car("Toyota", 120, 5);
        Car car1 = new Car("Mazda",180,2);
        Airplane airplane = new Airplane("Boeing 747", 900, 300);
        Airplane warplane = new Airplane("B-2", 3000, 2);

        // Displaying information and using their functionalities
        System.out.println("Car Details:");
        car.showInfo();
        car.drive();
        System.out.println("Capacity: " + car.getCapacity() + " passengers\n");

        System.out.println("Car Details:");
        car1.showInfo();
        car1.drive();
        System.out.println("Capacity: " + car1.getCapacity() + " passengers\n");

        System.out.println("Airplane Details:");
        warplane.showInfo();
        warplane.fly();
        System.out.println("Capacity: " + warplane.getCapacity() + " passengers\n");

        System.out.println("Airplane Details:");
        airplane.showInfo();
        airplane.fly();
        System.out.println("Capacity: " + airplane.getCapacity() + " passengers");
    }
}
