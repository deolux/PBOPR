package com.example.Pertemuan3;
import java.util.Scanner;

public class tokenization {
    public static void main(String[] args) {
        // Membaca input string dari pengguna
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        
        // Memisahkan string berdasarkan karakter non-alfabet menggunakan regular expression
        String[] tokens = s.split("[^A-Za-z]+");
        
        // Menghitung jumlah token dan mencetaknya
        int count = 0;
        for (String token : tokens) {
            if (!token.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
        
        // Mencetak setiap token yang tidak kosong
        for (String token : tokens) {
            if (!token.isEmpty()) {
                System.out.println(token);
            }
        }
    }
}
