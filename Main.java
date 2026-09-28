class Mahasiswa {
    String nama;
    String prodi;
    int nim;
    
    Mahasiswa(String nama, String prodi, int nim){
        this.nama = nama;
        this.prodi = prodi;
        this.nim = nim;
    }

    void tampilkanData(){
        System.out.println("Nama   :" +nama);
        System.out.println("Prodi  :" +prodi);
        System.out.println("NIM    :" +nim);
    }
}

public class Main{
    public static void main(String[] args){
    Mahasiswa mk1 = new Mahasiswa("Gading ", "Teknik Informatika", 125140074);
    Mahasiswa mk2 = new Mahasiswa("Janward ", "Teknik Telekomunikasi", 125140096);
    Mahasiswa mk3 = new Mahasiswa("Lumbantoruan ", "Teknik Elekro", 125140876);


    mk1.tampilkanData();
    mk2.tampilkanData();
    mk3.tampilkanData();
    }
}