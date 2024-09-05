package com.example.Pertemuan3;
import java.util.Scanner;
public class Soal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Konstanta
        final int ITEM_PRICE = 50000;
        final int BASE_SALARY = 500000;
        final int BONUS_25_PERCENT = 25;
        final int BONUS_35_PERCENT = 35;
        final int PENALTY_PERCENT = 15;
        final int MIN_SALES_FOR_BONUS_25 = 40;
        final int MIN_SALES_FOR_BONUS_35 = 80;
        final int MIN_SALES_FOR_PENALTY = 15;

        // Membaca jumlah penjualan
        int sales = scanner.nextInt();
        scanner.close();

        // Menghitung total penjualan dan bonus per item
        int totalSalesAmount = sales * ITEM_PRICE;
        double salesBonus = 0;
        double penalty = 0;

        // Logika bonus
        if (sales >= MIN_SALES_FOR_BONUS_35) {
            salesBonus = totalSalesAmount * BONUS_35_PERCENT / 100.0;
        } else if (sales >= MIN_SALES_FOR_BONUS_25) {
            salesBonus = totalSalesAmount * BONUS_25_PERCENT / 100.0;
        } else if (sales < MIN_SALES_FOR_PENALTY) {
            // Hitung denda jika penjualan di bawah 15 item
            int itemsBelow15 = MIN_SALES_FOR_PENALTY - sales;
            penalty = itemsBelow15 * ITEM_PRICE * PENALTY_PERCENT / 100.0;
        }

        // Menghitung total gaji, jika tidak ada bonus, hanya ada bonus per item 10%
        double totalSalary = BASE_SALARY + salesBonus - penalty;
        if (sales >= MIN_SALES_FOR_PENALTY) {
            totalSalary += (sales * ITEM_PRICE * 10 / 100.0);
        }

        // Mencetak hasil
        System.out.println((int) totalSalary);
    }
}

