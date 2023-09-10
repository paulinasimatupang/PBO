import java.util.Scanner;

public class jalan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //deklarasi objek Scanner untuk baca inputan pengguna

        //membaca dua set plat nomor untuk 4 mobil
        for (int j = 0; j < 2; j++) {
            int[] platNomor = new int[4]; //array platNomor untuk nyimpen 4 nomor plat mobil
            for (int i = 0; i < 4; i++) { //baca  4 plat mobil satu satu
                platNomor[i] = scanner.nextInt(); //membaca dan menyimpan dalam array
            }

            //menggabungkan angka plat nomor dan menghitung hasilnya
            int gabungan = 0; //inisialisasi var gabungan untuk menggabungkan angka-angka plat nomor
            for (int i = 0; i < 4; i++) { //hitung hasil gabungan dari angka-angka plat nomor
                gabungan += platNomor[i]; //menambahkan setiap no plat mobil ke var gabungan
            }

            //meriksa hasil dari (gabungan - 999999) habis dibagi 5 atau gak
            if ((gabungan - 999999) % 5 == 0) { 
                System.out.println("Berhenti"); //jika ya, maka akan menampilkan output Berhenti
            } else {
                System.out.println("Jalan"); //jika tidak, maka akan menampilkan output jalan
            }
        }

        scanner.close();
    }
}
