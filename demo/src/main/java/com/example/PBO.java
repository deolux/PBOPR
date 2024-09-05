package com.example;

class Foodjasera {
    protected String nama_makanan;
    protected String nama_kantin;
    protected int harga;

    protected String getName() {
        return this.nama_makanan;
    }
    protected int getHarga() {
        return this.harga;
    }
    protected String getNamaKantin() {
        return this.nama_kantin;
    }
    protected String getAll() {
        return this.nama_kantin + ", " + nama_makanan + ", " + harga ;
    }  
}

public class PBO {
    public static void main(String[] args) {
        Foodjasera menu1 = new Foodjasera();
        menu1.nama_makanan = "Ayam Geprek";
        menu1.harga = 12000;
        menu1.nama_kantin = "71 Geprek";

        Foodjasera menu2 = new Foodjasera();
        menu2.nama_makanan = "Baso Tahu";
        menu2.harga = 6000;
        menu2.nama_kantin = "Siomay Kang Asep";

        System.out.println("Menu 1 : " + menu1.getAll());
        System.out.println("Menu 2 : " + menu2.getName());
    }

}
