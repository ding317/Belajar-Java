class Mahasiswa{
    private String nama;
    private String nim;
    public void setNama(String nama){
        this.nama= nama;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public String getNama(){
        return nama;
    }
    public String getNim(){
        return nim;
    }
    public void tampilkanData(){
        System.out.println("Nama: "+nama);
        System.out.println("NIM : "+nim);
    }
}
public class Main1{
    public static void main (String [] args){
        Mahasiswa m1= new Mahasiswa();

        m1.setNama("Asrul");
        m1.setNim("12345678");

        m1.tampilkanData();
    }
}