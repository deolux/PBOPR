package com.example.Pertemuan6.Soal2;

public class TestShape {
    public static void main(String[] args) {
        // Test the no-arg constructor
        Shape shape1 = new Shape();
        System.out.println(shape1.toString());  // Expected output: "A Shape with color of green and filled"

        // Test the parameterized constructor
        Shape shape2 = new Shape("blue", false);
        System.out.println(shape2.toString());  // Expected output: "A Shape with color of blue and Not filled"

        // Test setters and getters
        shape2.setColor("yellow");
        shape2.setFilled(true);
        System.out.println("Color: " + shape2.getColor());  // Expected output: "yellow"
        System.out.println("Is filled: " + shape2.isFilled());  // Expected output: true

        // Test the toString method after modifying the object
        System.out.println(shape2.toString());  // Expected output: "A Shape with color of yellow and filled"
         // Test Square class
         Square square = new Square(5.0, "yellow", true);
         System.out.println(square.toString()); // Menampilkan informasi tentang persegi
         System.out.println("Area: " + square.getArea()); // Menampilkan area persegi
         System.out.println("Perimeter: " + square.getPerimeter()); // Menampilkan keliling persegi
 
         // Coba ubah ukuran sisi dan lihat efeknya
         square.setSide(7.0);
         System.out.println("Updated " + square.toString());
         System.out.println("Updated Area: " + square.getArea());
         System.out.println("Updated Perimeter: " + square.getPerimeter());
     
    }
}

