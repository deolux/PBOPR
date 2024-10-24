package com.example.Teori;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class UserException {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Usia kurang dari 18 tahun tidak diizinkan.");
        } else {
            System.out.println("Usia valid.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
