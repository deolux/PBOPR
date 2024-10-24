package com.example.Pertemuan8.StudiKasus3;

public class Sorting {
    public static void selectionSort(Comparable[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j].compareTo(list[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            Comparable temp = list[minIndex];
            list[minIndex] = list[i];
            list[i] = temp;
        }
    }

    public static void insertionSort(Comparable[] list) {
        for (int i = 1; i < list.length; i++) {
            Comparable key = list[i];
            int position = i;
            while (position > 0 && list[position - 1].compareTo(key) < 0) { // Descending order
                list[position] = list[position - 1];
                position--;
            }
            list[position] = key;
        }
    }
}

