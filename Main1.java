class Mahasiswa{
    private String nama;
    private String nim;
    private String prodi;
    private int semester;

    public void setNama(String nama){
        this.nama= nama;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public void setProdi(String prodi){
        this.prodi = prodi;
    }
    public void setSemester(int semester){
        if(semester > 0 ){
            this.semester = semester;}
            else {System.out.println("Semester tidak valid");
        }
    }
    public String getNama(){
        return nama;
    }
    public String getNim(){
        return nim;
    }
    public String getprodi(){
        return prodi;
    }
    public int getsemester(){
        return semester;
    }
    public void tampilkanData(){
        System.out.println("Nama   :"+nama);
        System.out.println("NIM    :"+nim);
        System.out.println("Prodi  :"+prodi);
        System.out.println("Semeser:"+semester);
    }
}
public class Main1{
    public static void main (String [] args){
        Mahasiswa m1= new Mahasiswa();

        m1.setNama("Asrul");
        m1.setNim("12345678");
        m1.setProdi("iep");
        m1.setSemester(14);

        m1.tampilkanData();
    }
}