package v1_halo;
class Hitung {
    int tambah(int a, int b) {
        return a + b;
    }
    int tambah(int a, int b, int c) {
        return a + b + c;
    }
    double tambah(double a, double b){
        return a + b;
    }
}
public class DemoOverloading {
    public static void main(String[] args) {
        Hitung h = new Hitung();
        System.out.println(h.tambah(5, 3));
        System.out.println(h.tambah(5, 3, 2));
        System.out.println(h.tambah(5, 3));
    }
}