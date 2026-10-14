package v1_halo;
class Hewan1 {
    void suara() {
        System.out.println("Hewan bersuara");
    }
}
class Kucing extends Hewan1 {
    void suara() {
        System.out.println("Kucing mengeong");
    }
}
class Anjing extends Hewan1 {
    void suara() {
        System.out.println("Anjing menggonggong");
    }
}

public class DemoOverriding {
    public static void main(String[] args) {
        Hewan1 h1 = new Kucing();
        Hewan1 h2 = new Anjing();
        h1.suara();
        h2.suara();
    }
}