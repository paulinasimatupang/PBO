package com.gab.penugasan5;
import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args) {
        String makan;
        int banyak;
        Scanner sc = new Scanner(System.in);
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);

        menu.tampilMenuMakanan();

        System.out.printf("Masukan makanan yang dibeli : ");
        makan = sc.nextLine();
        System.out.printf("Masukan jumlah : ");
        banyak = sc.nextInt();
        menu.mesen(makan,banyak);
        menu.tampilMenuMakanan();

    }
}