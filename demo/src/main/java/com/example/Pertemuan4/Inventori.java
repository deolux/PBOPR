package com.example.Pertemuan4;

public class Inventori 
{
    Barang[] barangs;
    void initBarang() 
    {
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }
    void showBarang() 
    {
        System.out.println(barangs[0].getNamaBarang() + " (" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].getNamaBarang() + " (" + barangs[1].getStok() + ")");
        
    }
    void pengadaan() 
    {
        initBarang();
        barangs[0].tambahStok(20); // Tambah stok baju
        showBarang();
    }
   
}   
