package com.example.Pertemuan3;
import java.math.BigInteger;
import java.util.Scanner;
public class Soal6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the two big integers from input
        BigInteger a = new BigInteger(scanner.nextLine().trim());
        BigInteger b = new BigInteger(scanner.nextLine().trim());
        
        // Perform addition and multiplication
        BigInteger sum = a.add(b);
        BigInteger product = a.multiply(b);
        
        // Output the results
        System.out.println(sum);
        System.out.println(product);
        
        scanner.close();
    }
}
