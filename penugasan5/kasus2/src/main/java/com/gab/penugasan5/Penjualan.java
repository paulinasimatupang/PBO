package com.gab.penugasan5;

public class Penjualan {
    private Produk produk;
    private int quantity;

    public Penjualan(Produk produk, int quantity) {
        this.produk = produk;
        this.quantity = quantity;
    }

    public Produk getProduk() {
        return produk;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalHarga() {
        return produk.getHarga() * quantity;
    }
}

