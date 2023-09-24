package com.gab.penugasan5;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));
        int hargatotal = 0;
        String keputusan = "Y";

        List<Produk> daftarMenu = new ArrayList<>();
        daftarMenu.add(new Produk("Batagor", 5000, 0));
        daftarMenu.add(new Produk("Roti Bakar", 12000, 0));
        daftarMenu.add(new Produk("Indomie+Telor", 10000, 0));
        daftarMenu.add(new Produk("Kwetiaw", 12000, 0));
        daftarMenu.add(new Produk("Nasi Goreng", 12000, 0));
        daftarMenu.add(new Produk("Air Mineral", 3000, 0));
        daftarMenu.add(new Produk("Teh Manis", 4000, 0));
        daftarMenu.add(new Produk("Jus Alpukat", 8000, 0));
        daftarMenu.add(new Produk("Teh Botol", 5000, 0));
        daftarMenu.add(new Produk("Kopi", 3000, 0));

        List<Penjualan> pesanan = new ArrayList<>();

        System.out.println("Daftar Menu Makanan");
        System.out.println("===========================");
        int nomorMenu = 1;
        for (Produk produk : daftarMenu) {
            System.out.println(nomorMenu + ". " + produk.getNamaProduk() + " = Rp " + produk.getHarga());
            nomorMenu++;
        }

        while (keputusan.equalsIgnoreCase("Y")) {
            try {
                System.out.print("Pilih nomor menu: ");
                int nomorPilihan = input.nextInt();
                input.nextLine();  // Mengonsumsi newline

                if (nomorPilihan >= 1 && nomorPilihan <= daftarMenu.size()) {
                    Produk produkPilihan = daftarMenu.get(nomorPilihan - 1);

                    System.out.print("Jumlah yang ingin dipesan: ");
                    int jumlahPesan = input.nextInt();

                    Penjualan penjualan = new Penjualan(produkPilihan, jumlahPesan);
                    pesanan.add(penjualan);

                    hargatotal += penjualan.getTotalHarga();
                    
                    System.out.println("\nPesanan Anda:");
                    System.out.println("===========================");
                    pesanan.forEach(penjualan2 -> {
                        Produk produk = penjualan.getProduk();
                        System.out.println(produk.getNamaProduk() + " x " + penjualan.getQuantity() + " = Rp " + penjualan.getTotalHarga());
                    });

                    System.out.println("\nTotal Bayar: Rp " + hargatotal);

                    System.out.print("Apakah Anda ingin memesan lagi? (Y/N): ");
                    keputusan = input2.readLine();
                } else {
                    System.out.println("Nomor menu tidak valid.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
