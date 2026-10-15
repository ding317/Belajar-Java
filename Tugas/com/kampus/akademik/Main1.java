//Buat Superclass Shape dengan method area() yang menampilkan "Menghitung luas...". 
//Kemudian buat dua Subclass: Circle (dengan field radius) dan Rectangle (dengan field width & height). 
//Override method area() di masing-masing subclass
package Tugas.com.kampus.akademik;

class Shape {
    void area(){
        System.out.println("Menghitung Luas Lingkaran");
    }
}
class Circle extends Shape {
    double radius;
    Circle (double radius){
        this.radius = radius;
    }
    @Override 
    void area(){
        double hasil = 3.14 * radius *radius;
        System.out.println("Luas Lingkran = "+hasil);
    }

}
class Rectangle extends Shape{
    double width, height;
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    @Override 
    void area(){
        double hasil = width * height;
        System.out.println("Luas Persegi Panjang = "+hasil);
    }
}
public class Main1 {
    public static void main (String[] aaa){
        Shape L= new Shape();
        Shape Circle = new Circle (7);
        Shape Rectangle = new Rectangle(5, 4);

        L.area();
        Circle.area();
        Rectangle.area();
    }
}
