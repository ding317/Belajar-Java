package v1_halo;
class Animal1 {
    String nama;
    int umur;

    Animal1(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    } 

    void tampilkanData(){
        System.out.println("Nama :"+nama);
        System.out.println("Umur :"+umur+ "tahun");
    }
    void makan(){
        System.out.println(nama +"sedang makan");
    }
    void tidur (){
        System.out.println(nama +"sedang tidur");
    }
}
class cuking extends Animal1{
    String ras;
    cuking(String nama, int umur,String ras){
        super(nama ,umur);
        this.ras = ras;
    }
    void sound(){
        System.out.println("Cat: meow moew moew");
        }
    void berburu(){
        System.out.println(("sedang berburu tikus"));
    }
    void tampilkanDataCuking(){
        tampilkanData();
        System.out.println("Ras "+ ras);
    }
}
class dog extends Animal1{
    String jenisGolongan;
    dog(String nama, int umur, String jenisGolongan){
        super(nama, umur);
        this.jenisGolongan  = jenisGolongan;
    }
    void menggonggong(){
        System.out.println("Sound Dog: wof wof wof");
    }
    void bermain(){
        System.out.println(nama + "sedang bermain bola");
    }
    void tampilakanDataDog(){
        tampilkanData();
        System.out.println("Golongan " +jenisGolongan);
    }
    }
class GoldenRetriever extends dog {

    // Constructor GoldenRetriever meneruskan data ke Anjing via super
    GoldenRetriever(String nama, int umur, String jenisGolongan) {
        super(nama, umur, jenisGolongan);
    }

    void berenang() {
        System.out.println(nama + " sedang berenang di kolam.");
    }

    void mengambil() {
        System.out.println(nama + " sedang mengambil kayu yang dilempar.");
    }
}
public class Animal{
    public static void main(String[] args){
        System.out.println("=== PERCOBAAN 2: OBJECT KUCING ===");
        cuking cat = new cuking ("Miyau", 2, "Persia");
        cat.tampilkanData();
        cat.makan();
        cat.tidur();
        cat.sound();
        cat.berburu();

        System.out.println();

        // Percobaan 3: Object Anjing
        System.out.println("=== PERCOBAAN 3: OBJECT ANJING ===");
        dog dog = new dog("Brody", 3, "Working Dog");
        dog.tampilkanData();
        dog.makan();
        dog.tidur();
        dog.menggonggong();
        dog.bermain();

        System.out.println();

        // Percobaan 5: Object GoldenRetriever
        System.out.println("=== PERCOBAAN 5: OBJECT GOLDEN RETRIEVER ===");
        GoldenRetriever golden = new GoldenRetriever("Buddy", 4, "Sporting Group");
        
        // Menampilkan data
        golden.tampilkanData();
        
        // 1. Method dari Hewan (Grandparent)
        golden.makan();
        golden.tidur();
        
        // 2. Method dari Anjing (Parent)
        golden.menggonggong();
        golden.bermain();
        
        // 3. Method miliknya sendiri
        golden.berenang();
        golden.mengambil();
    }
}