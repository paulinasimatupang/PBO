import java.math.BigInteger;
//mengimpor kelas BigInteger dari java.math. kelas ini untuk mengoperasikan angka-angka besar
//yang gabisa pakai tipe data bil bulat biasa
import java.util.Scanner;
//mengimpor kelas Scanner dari java.until untuk membaca input pengguna

public class bignumber { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String aStr = scanner.nextLine(); //membaca baris pertama dari input pengguna & menyimpan dalam aStr
        String bStr = scanner.nextLine(); //membaca baris kedua dari input pengguna & menyimpan dalam bStr

        //membuat objek BigInteger dari string input
        BigInteger a = new BigInteger(aStr); //input pertama
        BigInteger b = new BigInteger(bStr); //input kedua

        //menambahkan a dan b pake metode add dari kelas BigInteger
        BigInteger sum = a.add(b); 

        //mengalikan a dan b pake multiply dari kelas BigInteger
        BigInteger product = a.multiply(b); 

        //mencetak hasil penjumlahan
        System.out.println(sum);

        //mencetak hasil perkalian
        System.out.println(product);

        scanner.close();
    }
}
