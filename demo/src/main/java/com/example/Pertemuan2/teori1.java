package com.example.Pertemuan2;
import java.util.Scanner;

public class teori1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
        char grade;

        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = scanner.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = scanner.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = scanner.nextDouble();

        nilaiAkhir = (0.2 * nilaiTugas) + (0.35 * nilaiUTS) + (0.45 * nilaiUAS);

        if (nilaiAkhir >= 85) {
            grade = 'A';
        } else if (nilaiAkhir >= 75) {
            grade = 'B';
        } else if (nilaiAkhir >= 65) {
            grade = 'C';
        } else if (nilaiAkhir >= 49) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
