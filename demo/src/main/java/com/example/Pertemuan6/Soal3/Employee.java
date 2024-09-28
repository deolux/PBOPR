package com.example.Pertemuan6.Soal3;
// Abstract class Sortable
abstract class Sortable {
    public abstract int compare(Sortable b);

    // Shell sort implementation
    public static void shell_sort(Sortable[] a) {
        int n = a.length;
        int h = n / 2;
        while (h > 0) {
            for (int i = h; i < n; i++) {
                Sortable temp = a[i];
                int j = i;
                while (j >= h && a[j - h].compare(temp) > 0) {
                    a[j] = a[j - h];
                    j -= h;
                }
                a[j] = temp;
            }
            h = h / 2;
        }
    }
}

// Employee class implementing Sortable
class Employee extends Sortable {
    private String name;
    private double salary;
    private int hireday;
    private int hiremonth;
    private int hireyear;

    // Constructor
    public Employee(String n, double s, int day, int month, int year) {
        name = n;
        salary = s;
        hireday = day;
        hiremonth = month;
        hireyear = year;
    }

    // Print employee details
    public void print() {
        System.out.println(name + " " + salary + " " + hireYear());
    }

    // Raise salary
    public void raiseSalary(double byPercent) {
        salary *= 1 + byPercent / 100;
    }

    // Get hire year
    public int hireYear() {
        return hireyear;
    }

    // Implement compare method to compare salaries
    @Override
    public int compare(Sortable b) {
        Employee eb = (Employee) b;
        if (this.salary < eb.salary) return -1;
        if (this.salary > eb.salary) return 1;
        return 0;
    }

    // Override toString for better output readability
    @Override
    public String toString() {
        return name + " with salary " + salary + " hired in " + hireyear;
    }
}



    
