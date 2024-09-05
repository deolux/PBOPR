package com.example;
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input string A dan B
        String A = scanner.nextLine();
        String B = scanner.nextLine();

        // 1. Menjumlahkan panjang dari A dan B
        int totalLength = A.length() + B.length();
        System.out.println(totalLength);

        // 2. Mengecek apakah A lebih besar secara leksikografis dibandingkan B
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 3. Mengkapitalisasi huruf pertama dari A dan B, lalu mencetaknya
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);

        scanner.close();
    }
}