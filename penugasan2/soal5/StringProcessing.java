import java.util.Scanner;
//untuk mengimpor kelas Scanner(inputan dari pengguna) dari java.util agar dapat digunakan dalam program
public class StringProcessing {
    public static void main(String[] args) {
        //membuat objek  Scanner "scan" untuk membaca input
        Scanner scan = new Scanner(System.in);

        //mencetak dua string dari input
        System.out.print("String A: ");
        String A = scan.nextLine(); //membaca input daari pengguna & disimpan ke var A
        System.out.print("String B: ");
        String B = scan.nextLine(); //membaca input daari pengguna & disimpan ke var B

        //menjumlahkan panjang string A dan B kemudian hasilnya disimpan dalam var totalLength
        int totalLength = A.length() + B.length();

        //membandingkan string A dan B secara leksikografis
        String lexicoComparison = A.compareTo(B) > 0 ? "Ya" : "Tidak";

        //mengubah huruf pertama string A dan B menjadi uppercase yang kemudian disimpan 
        //dalam var capitalizedA dan capitalizedB
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);

        //menampilkan hasil
        System.out.println(totalLength);
        System.out.println(lexicoComparison);
        System.out.println(capitalizedA + " " + capitalizedB);

        scan.close();
    }
}
