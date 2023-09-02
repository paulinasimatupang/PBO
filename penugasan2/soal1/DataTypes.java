import java.util.Scanner;
//untuk mengimpor kelas Scanner(inputan dari pengguna) dari java.util agar dapat digunakan dalam program
public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//membaca inputan dari user
        System.out.print("T: "); //mencetak pesan, dengan T merupakan berapa kasus yang mau diujinya
        int T = scanner.nextInt(); //membaca input bilangan kemudian disimpan dalam var T

        for (int i = 0; i < T; i++) { //loop untuk perulangan sebanyak T kali
            try {
                long n = scanner.nextLong(); //inputan di simpan dalam var n

                // Check if it can be stored in byte, short, int, or long
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) { //memeriksa apakah n dapat disimpan dalam tipe daya byte, kalau bisa akan dicetak
                    System.out.println(n + " can be fitted in:");
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) { //memeriksa apakah n dapat disimpan dalam tipe daya short, kalau bisa akan dicetak
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) { //memeriksa apakah n dapat disimpan dalam tipe daya int, kalau bisa akan dicetak
                    System.out.println("* int");
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) { //memeriksa apakah n dapat disimpan dalam tipe daya long, kalau bisa akan dicetak
                    System.out.println("* long");
                }
            } catch (Exception e) { //jika angka yang diinputkan tidak dapat disimpan dalam tipe data apapun, maka akan dicetak
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
        scanner.close(); //menutup scanner setelah membaca inputan
    }
}

  