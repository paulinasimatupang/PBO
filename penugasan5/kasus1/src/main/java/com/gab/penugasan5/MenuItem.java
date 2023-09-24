package com.gab.penugasan5;

public class MenuItem {
    private String nama_makanan;
    private Double harga_makanan;
    private int stok;

    public MenuItem(String new_nama_makanan, double new_harga_makanan, int new_stock){
        this.nama_makanan = new_nama_makanan;
        this.harga_makanan = new_harga_makanan;
        this.stok = new_stock;
    }

    public String getNama_makanan(){
        return nama_makanan;
    }

    public Double getHarga_makanan(){
        return harga_makanan;
    }

    public int getStok(){
        return stok;
    }

    public void tampilmenu(){
        System.out.println(nama_makanan + "["+stok+"]"+"\tRp."+harga_makanan);
    }

    public void kurang(int x){
        stok -= x;
    }
}