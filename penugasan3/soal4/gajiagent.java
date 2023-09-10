import java.util.Scanner;

public class gajiagent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //deklarasi objek Scanner untuk baca inputan pengguna
        //membaca input selanjutnya sebagai bil bulat, jumlah penjualan bulan ini
        int totalSales = scanner.nextInt();

        int itemPrice = 50000;

        //untuk dapetin bonus
        int minterjual1 = 40;
        int minterjual2 = 80;

        //persentase bonus 
        double bonuspenjualan1 = 0.25; // 25%
        double bonuspenjualan2 = 0.35; // 35%
        double bonusPercentagePerItem = 0.10; // 10%
        double penaltyPercentage = 0.15; // 15%

        int gajipokok = 500000;

        //menghitung total pendapatan dari penjualan
        int totalEarnings = totalSales * itemPrice;

        //inisialisasi bonus
        double bonus = 0;

        //menghitung bonus penjualan
        if (totalSales >= minterjual2) { //jumlah penjualannya mencapai bonus paling gede gak?
            bonus = totalEarnings * bonuspenjualan2; //kalau iya, bonus bakal diitung sesuai presentasenya
        } else if (totalSales >= minterjual1) { //kalau gak, itung jumlah penjualannya mencapai bonus ke 2 gak?
            bonus = totalEarnings * bonuspenjualan1; //kalau iya, bonus bakal diitung sesuai presentasenya
        } else {
            //jika penjualan kurang dari 15 item, ada denda
            if (totalSales < 15) {
                int penalty = (int) (gajipokok * penaltyPercentage);
                gajipokok -= penalty;
            }
            bonus = totalSales * itemPrice * bonusPercentagePerItem; 
            //kalau gak, bonus yang keluar berdasarkan jumlah penjualan * harga perbarangnya * bonus
        }

        //menghitung total gaji
        int totalSalary = gajipokok + (int) bonus;

        //menampilkan gaji yang diterima
        System.out.println(totalSalary);

        scanner.close();
    }
}
