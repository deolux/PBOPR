package com.example.Pertemuan4;

public class Barang {
    private String kode_barang;
    private String nama_barang;
    private int stok;

    public Barang(String kode, String nama, int stk) {
        this.kode_barang = kode;
        this.nama_barang = nama;
        this.stok = stk;
    }
   

    // Getter untuk kode_barang
    public String getKodeBarang() {
        return kode_barang;
    }

    // Getter untuk nama_barang
    public String getNamaBarang() {
        return nama_barang;
    }

    // Getter untuk stok
    public int getStok() {
        return stok;
    }

    // Setter untuk stok, hanya bisa menambah stok
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
        } else {
            System.out.println("Jumlah stok tidak valid, hanya bisa ditambahkan.");
        }
    }
}
