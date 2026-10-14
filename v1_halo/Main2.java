class Matakuliah {
   
    private String kodeMK;
    private String namaMK;
    private int sks;
    private int semester;

   
    public Matakuliah() {
    }

    
    public Matakuliah(String kodeMK, String namaMK, int sks, int semester) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        setSks(sks);             
        setSemester(semester);   
    }

   

    public String getKodeMK() {
        return kodeMK;
    }

    public void setKodeMK(String kodeMK) {
        this.kodeMK = kodeMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public void setNamaMK(String namaMK) {
        this.namaMK = namaMK;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        if (sks > 0 && sks <= 6) {
            this.sks = sks;
        } else {
            System.out.println("SKS tidak valid! (Harus antara 1 - 6)");
        }
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        if (semester > 0 && semester <= 8) {
            this.semester = semester;
        } else {
            System.out.println("Semester tidak valid! (Harus antara 1 - 8)");
        }
    }

    
    public void tampilkanMataKuliah() {
        System.out.println("Kode MK  : " + kodeMK);
        System.out.println("Nama MK  : " + namaMK);
        System.out.println("SKS      : " + sks);
        System.out.println("Semester : " + semester);
        System.out.println("-----------------------------------");
    }
}
public class Main2 {
    public static void main(String[] args) {
      
        Matakuliah mk1 = new Matakuliah("INF101", "Pemrograman Berbasis Objek", 3, 3);

      
        Matakuliah mk2 = new Matakuliah();
        mk2.setKodeMK("INF102");
        mk2.setNamaMK("Struktur Data");
        mk2.setSks(4);
        mk2.setSemester(2);

        // Menampilkan data mata kuliah
        System.out.println("=== DATA MATA KULIAH 1 ===");
        mk1.tampilkanMataKuliah();

        System.out.println("=== DATA MATA KULIAH 2 ===");
        mk2.tampilkanMataKuliah();
    }
}