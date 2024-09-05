package com.example.Pertemuan3;
import java.util.Scanner;
public class Soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input
        String platNomor = scanner.nextLine();
        
        // Menghapus spasi di antara plat nomor
        String gabunganPlat = platNomor.replace(" ", "");
        
        // Mengubah gabungan plat nomor menjadi long (untuk menangani angka besar)
        long gabunganAngka = Long.parseLong(gabunganPlat);
        
        // Mengurangi dengan 999999
        long hasilKurang = gabunganAngka - 999999;
        
        // Cek apakah hasilKurang habis dibagi 5
        if (hasilKurang % 5 == 0) {
            System.out.println("berhenti");
        } else {
            System.out.println("jalan");
        }
        
        scanner.close();
    }
}
