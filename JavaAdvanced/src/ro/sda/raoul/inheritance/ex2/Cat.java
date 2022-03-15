package ro.sda.raoul.inheritance.ex2;

public class Cat extends Animal{


    public Cat(int age, double weight) {
        super(age, weight);
    }

    @Override
    public void yieldVoice() {
        System.out.println("The cat miaws.");
    }
}
