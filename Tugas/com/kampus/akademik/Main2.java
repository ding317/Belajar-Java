package Tugas.com.kampus.akademik;
// 1. SUPERCLASS: Kendaraan

class Kendaraan {
    // Penggunaan protected agar variabel bisa diakses langsung oleh Subclass
    protected String brand;
    protected int speed;

    // Konstruktor Superclass
    public Kendaraan(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void honk() {
        System.out.println(brand + " membunyikan klakson: Bip Bip!");
    }

    public void tampilkanInfo() {
        System.out.println("Merek: " + brand + " | Kecepatan Maksimum: " + speed + " km/jam");
    }
}

// 2. SUBCLASS 1: Mobil
class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String brand, int speed, int jumlahPintu) {
        // 'super()' memanggil konstruktor milik superclass (Kendaraan)
        super(brand, speed); 
        this.jumlahPintu = jumlahPintu;
    }

    // Method Overriding dengan 'super'
    @Override
    public void honk() {
        super.honk(); // Memanggil method honk() asli milik Kendaraan
        System.out.println("-> Suara klakson mobil " + brand + " terdengar sangat nyaring!");
    }

    // Method Unik milik Mobil
    public void bukaSunroof() {
        System.out.println("Mobil " + brand + " (" + jumlahPintu + " pintu) sedang membuka sunroof.");
    }
}

// 3. SUBCLASS 2: Motor (di-set 'final')
// Keyword 'final' membuat class Motor TIDAK BISA diturunkan lagi ke class lain (misal: class MotorSport)
final class Motor extends Kendaraan {
    private String tipeRantai;

    public Motor(String brand, int speed, String tipeRantai) {
        super(brand, speed);
        this.tipeRantai = tipeRantai;
    }

    // Method Unik milik Motor
    public void wheelie() {
        System.out.println("Motor " + brand + " (Rantai: " + tipeRantai + ") melaju " + speed + " km/jam dan melakukan aksi wheelie!");
    }
}

// 4. MAIN CLASS
public class Main2 {
    public static void main(String[] args) {
        System.out.println("=== 1. Instansiasi Objek ===");
        Mobil mobil = new Mobil("Toyota", 180, 4);
        Motor motor = new Motor("Yamaha", 120, "O-Ring");

        // Memanggil method turunan dari Kendaraan
        mobil.tampilkanInfo();
        motor.tampilkanInfo();

        System.out.println("\n=== 2. Overriding & Super Keyword ===");
        mobil.honk(); // Menjalankan honk() milik Mobil (yang memanggil super.honk())
        motor.honk(); // Menjalankan honk() bawaan Kendaraan

        System.out.println("\n=== 3. Method Unik Subclass ===");
        mobil.bukaSunroof();
        motor.wheelie();

        System.out.println("\n=== 4. Polimorfisme & Downcasting (Lanjutan) ===");
        // Variabel tipe Superclass (Kendaraan) menampung objek Subclass
        Kendaraan[] garasi = { mobil, motor };

        for (Kendaraan k : garasi) {
            k.tampilkanInfo();

            // Pengecekan tipe objek menggunakan 'instanceof' untuk mengakses method unik
            if (k instanceof Mobil m) {
                m.bukaSunroof();
            } else if (k instanceof Motor m) {
                m.wheelie();
            }
            System.out.println("------------------------------------");
        }
    }
}