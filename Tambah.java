public class Tambah{
    public double jumlah(double a, double b){
        return a+b;
    }
    public int jumlah (int a, int b, int c){
        return a+b+c;
    }
    public static void main (String[] args){
        Tambah t1= new Tambah();
        
        System.out.println("Hasil:"+t1.jumlah(1,2));
        System.out.println("Hasil:"+t1.jumlah(1,2,3));

    }
}