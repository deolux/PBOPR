package com.example.Pertemuan5;

public class Jadwal {
    private String hari;
    private String jam;
    private Dosen dosen;
    private Ruangan ruangan;

    public Jadwal(String hari, String jam, Dosen dosen, Ruangan ruangan) {
        this.hari = hari;
        this.jam = jam;
        this.dosen = dosen;
        this.ruangan = ruangan;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public Ruangan getRuangan() {
        return ruangan;
    }

    public void setRuangan(Ruangan ruangan) {
        this.ruangan = ruangan;
    }

    public void tampilkanJadwal() {
        System.out.println("Hari: " + hari + ", Jam: " + jam + ", Dosen: " + dosen.getNama()  + ", Ruangan: " + ruangan.getNamaRuangan());
    }
               
}
