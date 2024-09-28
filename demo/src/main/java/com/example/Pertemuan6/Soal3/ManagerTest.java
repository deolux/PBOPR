package com.example.Pertemuan6.Soal3;

public class ManagerTest {
    public static void main(String[] args) {
        Manager[] managers = new Manager[3];
        managers[0] = new Manager("John Doe", 3000000, 15, 1, 2010);
        managers[1] = new Manager("Jane Smith", 3500000, 20, 5, 2012);
        managers[2] = new Manager("Emily Johnson", 4000000, 10, 7, 2015);

        // Print the array before sorting
        System.out.println("Before Sorting:");
        for (Manager m : managers) {
            m.print();
        }

        // Sort the managers using shell sort
        Sortable.shell_sort(managers);

        // Print the array after sorting
        System.out.println("\nAfter Sorting:");
        for (Manager m : managers) {
            m.print();
        }
    }
}