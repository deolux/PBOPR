package com.example.Teori;
public class UncheckedException {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        
        // Mencoba mengakses elemen yang tidak ada
        System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
    }
}
