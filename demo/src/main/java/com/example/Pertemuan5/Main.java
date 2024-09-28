package com.example.Pertemuan5;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Data Mahasiswa
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new Mahasiswa("Rina", 20, "12345", "Teknik Informatika", "D3"));
        mahasiswaList.add(new Mahasiswa("Budi", 21, "23456", "Sistem Informasi", "D4"));
        mahasiswaList.add(new Mahasiswa("Siti", 19, "34567", "Teknik Informatika", "D3"));
        mahasiswaList.add(new Mahasiswa("Andi", 22, "45678", "Sistem Informasi", "D4"));
        mahasiswaList.add(new Mahasiswa("Roni", 20, "56789", "Teknik Informatika", "D4"));
        mahasiswaList.add(new Mahasiswa("Ayu", 21, "67890", "Sistem Informasi", "D3"));
        mahasiswaList.add(new Mahasiswa("Riko", 20, "78901", "Teknik Informatika", "D4"));
        mahasiswaList.add(new Mahasiswa("Tina", 22, "89012", "Sistem Informasi", "D4"));
        mahasiswaList.add(new Mahasiswa("Eko", 23, "90123", "Teknik Informatika", "D3"));
        mahasiswaList.add(new Mahasiswa("Ani", 20, "01234", "Sistem Informasi", "D3"));

        // Tampilkan Data Mahasiswa
        System.out.println("====================================");
        System.out.println("         DATA MAHASISWA");
        System.out.println("====================================");
        System.out.printf("%-5s %-20s %-10s %-20s %-10s\n", "No", "Nama", "NIM", "Jurusan", "Program Studi");
        System.out.println("---------------------------------------------------------------");
        
        int i = 1;
        for (Mahasiswa mhs : mahasiswaList) {
            System.out.printf("%-5d %-20s %-10s %-20s %-10s\n", i++, mhs.getNama(), mhs.getNim(), mhs.getJurusan(), mhs.getProgramStudi());
        }
        System.out.println("====================================\n");

        // Data Dosen
        List<Dosen> dosenList = new ArrayList<>();
        dosenList.add(new Dosen("Dr. Andi", 45, "001", "Algoritma"));
        dosenList.add(new Dosen("Dr. Siti", 50, "002", "Jaringan Komputer"));
        dosenList.add(new Dosen("Dr. Budi", 40, "003", "Basis Data"));
        dosenList.add(new Dosen("Dr. Rina", 35, "004", "Pemrograman Web"));
        dosenList.add(new Dosen("Dr. Eko", 43, "005", "Pemrograman Berorientasi Objek"));
        dosenList.add(new Dosen("Dr. Ani", 42, "006", "Kecerdasan Buatan"));
        dosenList.add(new Dosen("Dr. Riko", 37, "007", "Pemrograman Mobile"));
        dosenList.add(new Dosen("Dr. Roni", 39, "008", "Keamanan Jaringan"));
        dosenList.add(new Dosen("Dr. Tina", 41, "009", "Pemrosesan Citra"));
        dosenList.add(new Dosen("Dr. Ayu", 38, "010", "Sistem Operasi"));

        // Tampilkan Data Dosen
        System.out.println("====================================");
        System.out.println("         DATA DOSEN");
        System.out.println("====================================");
        System.out.printf("%-5s %-20s %-10s %-20s\n", "No", "Nama", "NIP", "Mata Kuliah");
        System.out.println("---------------------------------------------------------------");

        i = 1;
        for (Dosen dosen : dosenList) {
            System.out.printf("%-5d %-20s %-10s %-20s\n", i++, dosen.getNama(), dosen.getNip(), dosen.getMataKuliah());
        }
        System.out.println("====================================\n");

        // Data Jadwal Perkuliahan (Senin - Jumat)
        List<Jadwal> jadwalList = new ArrayList<>();
        jadwalList.add(new Jadwal("Senin", "08:00 - 10:00", dosenList.get(0), new Ruangan("Lab 1")));
        jadwalList.add(new Jadwal("Selasa", "10:00 - 12:00", dosenList.get(1), new Ruangan("Lab 2")));
        jadwalList.add(new Jadwal("Rabu", "13:00 - 15:00", dosenList.get(2), new Ruangan("Lab 3")));
        jadwalList.add(new Jadwal("Kamis", "08:00 - 10:00", dosenList.get(3), new Ruangan("Lab 4")));
        jadwalList.add(new Jadwal("Jumat", "10:00 - 12:00", dosenList.get(4), new Ruangan("Lab 5")));

        // Tampilkan Jadwal Perkuliahan
        System.out.println("====================================");
        System.out.println("      JADWAL PERKULIAHAN");
        System.out.println("====================================");
        System.out.printf("%-10s %-20s %-20s %-15s\n", "Hari", "Jam", "Dosen", "Ruangan");
        System.out.println("---------------------------------------------------------------");

        for (Jadwal jadwal : jadwalList) {
            System.out.printf("%-10s %-20s %-20s %-15s\n", jadwal.getHari(), jadwal.getJam(), jadwal.getDosen().getNama(), jadwal.getRuangan().getNamaRuangan());
        }
        System.out.println("====================================\n");
    }
}
