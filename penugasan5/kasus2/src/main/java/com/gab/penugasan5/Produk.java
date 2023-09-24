package com.gab.penugasan5;

public class Produk {
    private String nama_produk;
    private int harga;
    private int qty;

    public Produk(String nama_produk, int harga, int qty) {
        this.nama_produk = nama_produk;
        this.harga = harga;
        this.qty = qty;
    }

    public String getNamaProduk() {
        return nama_produk;
    }

    public int getHarga() {
        return harga;
    }

    public int getQty() {
        return qty;
    }
}
