package com.gab.penugasan5;

public class Restaurant {
    private MenuItem[] menuMakanan;
    public static byte id=0;

    public Restaurant() {
        menuMakanan = new MenuItem[15];
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.menuMakanan[id] = new MenuItem(nama,harga,stok);
    }

    public void tampilMenuMakanan(){
        for(int i =0; i<=id;i++){
            if(!isOutOfStock(i)){
                this.menuMakanan[i].tampilmenu();
            }
        }
    }

    public boolean isOutOfStock(int id){
       return menuMakanan[id].getStok() == 0;
    }

    public static void nextId(){
        id++;
    }

    public void mesen(String nama, int jumlah){
        for(int i = 0; i <= id; i++){
            if(nama.equals(menuMakanan[i].getNama_makanan())){
                if(menuMakanan[i].getStok() >= jumlah){
                    menuMakanan[i].kurang(jumlah);
                }
                else{
                    System.out.println("Stok "+menuMakanan[i].getNama_makanan() + " tidak cukup");
                }
            }
        }

    }
}