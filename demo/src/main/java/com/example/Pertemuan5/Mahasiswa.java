package com.example.Pertemuan5;

public class Mahasiswa extends Person {
    private String nim;
    private String jurusan;
    private String programStudi;

    public Mahasiswa(String nama, int umur, String nim, String jurusan, String programStudi) {
        super(nama, umur);
        this.nim = nim;
        this.jurusan = jurusan;
        this.programStudi = programStudi;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    @Override
    public void tampilkanData() {
        System.out.println("Mahasiswa: " + getNama() + ", NIM: " + nim + ", Jurusan: " + jurusan + ", Program Studi: " + programStudi);
    }
}