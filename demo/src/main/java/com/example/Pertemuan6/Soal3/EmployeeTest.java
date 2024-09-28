package com.example.Pertemuan6.Soal3;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 10, 1, 1989);
        staff[1] = new Employee("Maria Bianchi", 2500000, 12, 1, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 11, 1, 1993);

        // Print the array before sorting
        System.out.println("Before Sorting:");
        for (Employee e : staff) {
            e.print();
        }

        // Sort the employees using shell sort
        Sortable.shell_sort(staff);

        // Print the array after sorting
        System.out.println("\nAfter Sorting:");
        for (Employee e : staff) {
            e.print();
        }
    }
}