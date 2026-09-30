class Animal1 {
    void sound(){
        System.out.println("Animal Berbunyi");
    }
}
class dog extends Animal{
    void sound(){
        System.out.println("Sounf Dog: wof wof wof");
    }
}
class cat extends Animal{
    void sound(){
        System.out.println("Cat:meow moew moew");

        }
    }
public class Animal{
    public static void main(String[] args){
        Animal1 ref;

    ref = new dog();
    ref.sound();
    ref = new cat();
    ref.sound();
    }
}