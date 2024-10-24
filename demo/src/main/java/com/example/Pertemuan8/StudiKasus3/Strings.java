package com.example.Pertemuan8.StudiKasus3;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n = scan.nextInt();
        scan.nextLine();  // Consume newline

        String[] strings = new String[n];

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = scan.nextLine();
        }

        Sorting.insertionSort(strings);  // Sorting using insertionSort (descending order)
        System.out.println("Sorted strings in descending order:");
        for (String str : strings) {
            System.out.print(str + " ");
        }
    }
}

