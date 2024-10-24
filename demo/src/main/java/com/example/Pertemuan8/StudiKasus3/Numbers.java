package com.example.Pertemuan8.StudiKasus3;

// Numbers.java
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scan.nextInt();
        Integer[] numbers = new Integer[n];  // Integer array for autoboxing

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scan.nextInt();  // Autoboxing int to Integer
        }

        Sorting.insertionSort(numbers);  // Sorting using Comparable array
        System.out.println("Sorted numbers:");
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
    }
}