package ro.sda.raoul.inheritance.ex2;

public class Main {
    public static void main(String[] args) {
        Animal animal=new Cat(2,2.3);
        Animal animal2=new Dog(2,23);

        animal.yieldVoice();
        animal2.yieldVoice();
    }
}
