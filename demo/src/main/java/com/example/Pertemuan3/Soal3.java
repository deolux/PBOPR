import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membaca input berupa angka pertama, operator, dan angka kedua
        int A = scanner.nextInt();
        char operator = scanner.next().charAt(0);
        int B = scanner.nextInt();
        
        // Variabel untuk menyimpan hasil
        int result = 0;
        
        // Evaluasi operator dan lakukan operasi yang sesuai
        switch (operator) {
            case '+':
                result = A + B;
                break;
            case '-':
                result = A - B;
                break;
            case '*':
                result = A * B;
                break;
            case '/':
                if (B != 0) {
                    result = A / B;
                } else {
                    System.out.println("Pembagian dengan nol tidak diperbolehkan.");
                    return;
                }
                break;
            case '%':
                result = A % B;
                break;
            default:
                System.out.println("Operator tidak valid");
                return;
        }
        
        // Mencetak hasil
        System.out.println(result);
        
        scanner.close();
    }
}
