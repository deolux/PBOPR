package com.example.Pertemuan6.Soal2;
public class Square extends Rectangle {

    // Constructor dengan satu argumen (side)
    public Square(double side) {
        super(side, side); // Memanggil konstruktor superclass Rectangle(double, double)
    }

    // Constructor dengan argumen side, color, dan filled
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled); // Memanggil konstruktor superclass Rectangle(double, double, String, boolean)
    }

    // Getter untuk side (menggunakan lebar/width karena persegi memiliki sisi yang sama untuk panjang dan lebar)
    public double getSide() {
        return getWidth(); // Karena width dan length sama di persegi
    }

    // Setter untuk side (mengubah panjang dan lebar agar tetap berbentuk persegi)
    public void setSide(double side) {
        setWidth(side);  // Memastikan panjang dan lebar tetap sama
        setLength(side); // Memastikan panjang dan lebar tetap sama
    }

    // Override metode setWidth dan setLength untuk mempertahankan geometri persegi
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side); // Menjaga panjang sama dengan lebar
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side); // Menjaga lebar sama dengan panjang
    }

    // Override metode toString untuk mengembalikan representasi string dari persegi
    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}
