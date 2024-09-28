package com.example.Teori;
// Class A
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

// Class B yang meng-aggregate Class A
class Car {
    private String model;
    private Engine engine;  // Engine sebagai bagian dari Car (Aggregation)

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public void drive() {
        if (engine != null) {
            engine.start();
            System.out.println(model + " is driving with engine: " + engine.getType());
        } else {
            System.out.println(model + " has no engine.");
        }
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        // Membuat objek Engine
        Engine myEngine = new Engine("V8");

        // Membuat objek Car yang meng-aggregate Engine
        Car myCar = new Car("Mustang", myEngine);

        // Menjalankan fungsi drive pada Car
        myCar.drive();

        // Membuat Car tanpa Engine
        Car carWithoutEngine = new Car("Tesla", null);
        carWithoutEngine.drive();
    }
}
