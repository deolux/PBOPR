package com.example.Pertemuan3;
import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            // Membaca input string dan integer
            String s = scanner.next();
            int x = scanner.nextInt();
            
            // Mencetak string dan integer sesuai format
            System.out.printf("%-15s%03d%n", s, x);
        }
        System.out.println("================================");
        
        scanner.close();
    }
}


