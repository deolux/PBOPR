package com.example.Pertemuan8.StudiKasus2;

public class PaintThings {
    public static void main(String[] args) {
        Paint paint = new Paint(350); // Coverage in square feet per gallon

        // Instantiate shapes
        Shape deck = new Rectangle(20, 35);
        Shape bigBall = new Sphere(15);
        Shape tank = new Cylinder(10, 30);

        // Calculate amount of paint needed
        double deckAmount = paint.amount(deck);
        double ballAmount = paint.amount(bigBall);
        double tankAmount = paint.amount(tank);

        // Output results
        System.out.printf("Paint needed for deck: %.2f gallons%n", deckAmount);
        System.out.printf("Paint needed for big ball: %.2f gallons%n", ballAmount);
        System.out.printf("Paint needed for tank: %.2f gallons%n", tankAmount);
    }
}
