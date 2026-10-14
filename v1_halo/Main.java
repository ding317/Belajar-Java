class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private int semester;

  
    public Mahasiswa() {
    }

   
    public Mahasiswa(String nama, String nim, String prodi, int semester) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        setSemester(semester);
    }

   
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
        Mahasiswa m1 = new Mahasiswa("Asrul", "12345678", "Informatika", 4);

        Mahasiswa m2 = new Mahasiswa("Budi Santoso", "87654321", "Sistem Informasi", 2);

       
        Mahasiswa m3 = new Mahasiswa();
        m3.setNama("Citra Dewi");
        m3.setNim("11223344");
        m3.setProdi("Teknik Komputer");
        m3.setSemester(6);

       
        System.out.println("=== DATA MAHASISWA 1 ===");
        m1.tampilkanData();

        System.out.println("=== DATA MAHASISWA 2 ===");
        m2.tampilkanData();

        System.out.println("=== DATA MAHASISWA 3 ===");
        m3.tampilkanData();
    }
}