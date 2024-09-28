package com.example.Pertemuan5;

public class Dosen extends Person {
    private String nip;
    private String mataKuliah;

    public Dosen(String nama, int umur, String nip, String mataKuliah) {
        super(nama, umur);
        this.nip = nip;
        this.mataKuliah = mataKuliah;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    @Override
    public void tampilkanData() {
        System.out.println("Dosen: " + getNama() + ", NIP: " + nip + ", Mata Kuliah: " + mataKuliah);
    }
}