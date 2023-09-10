import java.util.Scanner;

public class berhitung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //membaca inputan 
        int A = scanner.nextInt();
        char operator = scanner.next().charAt(0); // Membaca karakter operator
        int B = scanner.nextInt();

        //inisialisasi var untuk hasil
        int result = 0;

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
                result = A / B;
                break;
            case '%':
                result = A % B;
                break;
            default:
                System.out.println("Operator tidak valid.");
                return; //bukan operator yg d deklarasiin
        }
        //hasil
        System.out.println(result);

        scanner.close();
    }
}
