package com.example.Pertemuan8.StudiKasus3;
import java.util.Scanner;

public class WeeklySales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of salespeople: ");
        int numSalespeople = scan.nextInt();
        scan.nextLine(); // Consume newline

        Salesperson[] salespeople = new Salesperson[numSalespeople];

        // Input data for each salesperson
        for (int i = 0; i < numSalespeople; i++) {
            System.out.println("Enter details for salesperson " + (i + 1) + ":");
            System.out.print("First name: ");
            String firstName = scan.nextLine();
            System.out.print("Last name: ");
            String lastName = scan.nextLine();
            System.out.print("Total sales: ");
            int totalSales = scan.nextInt();
            scan.nextLine(); // Consume newline

            // Create Salesperson object and add to array
            salespeople[i] = new Salesperson(firstName, lastName, totalSales);
        }

        // Sort salespeople using insertion sort based on total sales and name
        Sorting.selectionSort(salespeople);

        // Output sorted salespeople
        System.out.println("\nSorted Salespeople:");
        for (Salesperson s : salespeople) {
            System.out.println(s);
        }
    }
}
