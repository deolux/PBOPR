package com.example.Teori;
import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("file.txt");
            BufferedReader fileInput = new BufferedReader(file);
            
            // Membaca baris pertama file
            System.out.println(fileInput.readLine());
            fileInput.close();
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e);
        }
    }
}