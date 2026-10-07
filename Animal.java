class Animal1 {
    String nama;
    String Ras;
    int umur;

    Animal1(String nama, String Ras,int umur){
        this.nama = nama;
        this.Ras = Ras;
        this.umur = umur;
    } 

    void tampilkanData(){
        System.out.println("Nama :"+nama);
        System.out.println("Ras  :"+Ras);
        System.out.println("Umur :"+umur);
    }
    void sound(){
        System.out.println("Animal Berbunyi");
    }
}
class dog extends Animal{
    void sound(){
        System.out.println("Sound Dog: wof wof wof");
    }
}
class cat extends Animal{
    void sound(){
        System.out.println("Cat: meow moew moew");

        }
    }
public class Animal{
    public static void main(String[] args){
        Animal1 hewandog  = new Animal1("Brody","Niver",5);
        dog ref = new dog();
        cat ref1 = new cat();
        hewandog.tampilkanData();
        ref.sound();
        Animal1 hewancat  = new Animal1("miyau","elep",1000);
        hewancat.tampilkanData();
        ref1.sound();

    }
} 