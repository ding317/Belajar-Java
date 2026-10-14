class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private int semester;

    // Konstruktor Tanpa Parameter (Default)
    public Mahasiswa() {
    }

    // Konstruktor Berparameter
    public Mahasiswa(String nama, String nim, String prodi, int semester) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        setSemester(semester);
    }

    // --- Setter ---
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setSemester(int semester) {
        if (semester > 0 && semester <= 14) {
            this.semester = semester;
        } else {
            System.out.println("Semester tidak valid!");
        }
    }

    // --- Getter ---
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getProdi() {
        return prodi;
    }

    public int getSemester() {
        return semester;
    }

    // Method untuk menampilkan data satu mahasiswa
    public void tampilkanData() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Prodi   : " + prodi);
        System.out.println("Semester: " + semester);
        System.out.println("-----------------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat Objek 1 (Menggunakan Konstruktor Berparameter)
        Mahasiswa m1 = new Mahasiswa("Asrul", "12345678", "Informatika", 4);

        // Membuat Objek 2 (Menggunakan Konstruktor Berparameter)
        Mahasiswa m2 = new Mahasiswa("Budi Santoso", "87654321", "Sistem Informasi", 2);

        // Membuat Objek 3 (Menggunakan Setter)
        Mahasiswa m3 = new Mahasiswa();
        m3.setNama("Citra Dewi");
        m3.setNim("11223344");
        m3.setProdi("Teknik Komputer");
        m3.setSemester(6);

        // Menampilkan data setiap objek secara langsung satu per satu
        System.out.println("=== DATA MAHASISWA 1 ===");
        m1.tampilkanData();

        System.out.println("=== DATA MAHASISWA 2 ===");
        m2.tampilkanData();

        System.out.println("=== DATA MAHASISWA 3 ===");
        m3.tampilkanData();
    }
}