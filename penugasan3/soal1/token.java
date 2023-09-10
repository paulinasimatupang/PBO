import java.util.Scanner;

public class token {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //deklarasi objek Scanner untuk baca inputan pengguna
       
        String input = scanner.nextLine();
        //membaca input string dan disimpan dalam var input

        String[] tokens = input.split("[^A-Za-z]+");
        //membuat array tokens untuk menyimpan token yang dihasilkan 
        //split digunakan untuk memecah string input menjadi token berdasarkan ketentuan [^A-Za-z]+

        System.out.println(tokens.length);
        //mencetak jumlah token dari string 

        //loop untuk mengulangi setiap elemen dalam array koneees
        for (String token : tokens) {
            System.out.println(token); //mencetak output
        }
        scanner.close();
    }
}
