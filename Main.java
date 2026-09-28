class Mahasiswa {
    String nama;
    String nim;
    String prodi;
    void tampilkanData(){
        System.out.println("Nama   : " +nama);
        System.out.println("NIM    :" +nim);
        System.out.println("Prodi  :"+prodi);
    }
}

public class Main{
    public static void main(String[] args){
    Mahasiswa mhs1 = new Mahasiswa();

    mhs1.nama= "Abdi";
    mhs1.nim="125140084";
    mhs1.prodi="iep";

    mhs1.tampilkanData();
    }
}