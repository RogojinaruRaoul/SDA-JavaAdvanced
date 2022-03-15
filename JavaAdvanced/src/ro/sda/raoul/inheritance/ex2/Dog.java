package ro.sda.raoul.inheritance.ex2;

public class Dog extends Animal{


    public Dog(int age,double weight){
        super(age,weight);
    }

    @Override
    public void yieldVoice() {
        System.out.println("The dog barks.");
    }
}
