package com.example.Teori;

// Class A sebagai dependency
class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void start() {
        System.out.println("Engine started: " + type);
    }
}

// Class B yang bergantung pada Class A
class Car {
    private Engine engine;

    // Car bergantung pada Engine
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car is moving with engine: " + engine.getType());
    }
}

public class PBO3 {
    public static void main(String[] args) {
        // Membuat objek Engine
        Engine myEngine = new Engine("V8");

        // Car bergantung pada Engine
        Car myCar = new Car(myEngine);

        // Menjalankan fungsi drive pada Car
        myCar.drive();
    }
}
