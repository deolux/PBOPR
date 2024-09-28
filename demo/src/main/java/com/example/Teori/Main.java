package com.example.Teori;
// Abstract class Kendaraan
abstract class Kendaraan {
    protected int kecepatanMaks;
    protected String bahanBakar;

    // Abstract methods
    public abstract void start();
    public abstract void berhenti();
}

// Concrete class Mobil (extends Kendaraan)
class Mobil extends Kendaraan {
    private int jumlahPintu;

    // Constructor
    public Mobil(int kecepatanMaks, String bahanBakar, int jumlahPintu) {
        this.kecepatanMaks = kecepatanMaks;
        this.bahanBakar = bahanBakar;
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void start() {
        System.out.println("Mobil dengan " + jumlahPintu + " pintu dan bahan bakar " + bahanBakar + " mulai berjalan.");
    }

    @Override
    public void berhenti() {
        System.out.println("Mobil berhenti.");
    }
}

// Concrete class SepedaMotor (extends Kendaraan)
class SepedaMotor extends Kendaraan {
    private String jenisStang;

    // Constructor
    public SepedaMotor(int kecepatanMaks, String bahanBakar, String jenisStang) {
        this.kecepatanMaks = kecepatanMaks;
        this.bahanBakar = bahanBakar;
        this.jenisStang = jenisStang;
    }

    @Override
    public void start() {
        System.out.println("Sepeda Motor dengan stang " + jenisStang + " dan bahan bakar " + bahanBakar + " mulai berjalan.");
    }

    @Override
    public void berhenti() {
        System.out.println("Sepeda Motor berhenti.");
    }
}

// Abstract class TransportasiPublik (extends Kendaraan)
abstract class TransportasiPublik extends Kendaraan {
    protected int kapasitasPenumpang;

    // Abstract method
    public abstract void angkutPenumpang();
}

// Concrete class Bus (extends TransportasiPublik)
class Bus extends TransportasiPublik {
    private String trayek;

    // Constructor
    public Bus(int kecepatanMaks, String bahanBakar, int kapasitasPenumpang, String trayek) {
        this.kecepatanMaks = kecepatanMaks;
        this.bahanBakar = bahanBakar;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.trayek = trayek;
    }

    @Override
    public void start() {
        System.out.println("Bus dengan kapasitas " + kapasitasPenumpang + " penumpang pada trayek " + trayek + " mulai berjalan.");
    }

    @Override
    public void berhenti() {
        System.out.println("Bus berhenti.");
    }

    @Override
    public void angkutPenumpang() {
        System.out.println("Bus mengangkut penumpang.");
    }
}

// Concrete class KeretaApi (extends TransportasiPublik)
class KeretaApi extends TransportasiPublik {
    private int jumlahGerbong;

    // Constructor
    public KeretaApi(int kecepatanMaks, String bahanBakar, int kapasitasPenumpang, int jumlahGerbong) {
        this.kecepatanMaks = kecepatanMaks;
        this.bahanBakar = bahanBakar;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.jumlahGerbong = jumlahGerbong;
    }

    @Override
    public void start() {
        System.out.println("Kereta Api dengan " + jumlahGerbong + " gerbong mulai berjalan.");
    }

    @Override
    public void berhenti() {
        System.out.println("Kereta Api berhenti.");
    }

    @Override
    public void angkutPenumpang() {
        System.out.println("Kereta Api mengangkut penumpang.");
    }
}

// Main class untuk menampilkan output dari setiap class
public class Main {
    public static void main(String[] args) {
        // Membuat objek Mobil
        Mobil mobil = new Mobil(180, "Bensin", 4);
        mobil.start();
        mobil.berhenti();

        System.out.println(); // Spasi antar output

        // Membuat objek SepedaMotor
        SepedaMotor sepedaMotor = new SepedaMotor(120, "Bensin", "Stang Sport");
        sepedaMotor.start();
        sepedaMotor.berhenti();

        System.out.println(); // Spasi antar output

        // Membuat objek Bus
        Bus bus = new Bus(100, "Solar", 50, "Jakarta-Bandung");
        bus.start();
        bus.angkutPenumpang();
        bus.berhenti();

        System.out.println(); // Spasi antar output

        // Membuat objek KeretaApi
        KeretaApi keretaApi = new KeretaApi(200, "Diesel", 500, 10);
        keretaApi.start();
        keretaApi.angkutPenumpang();
        keretaApi.berhenti();
    }
}    