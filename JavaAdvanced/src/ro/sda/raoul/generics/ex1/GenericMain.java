package ro.sda.raoul.generics.ex1;

public class GenericMain {
    public static void main(String[] args) {
        Person person1 = new Person("Marius", 1.81);
        Person person2 = new Person("Andrei", 1.81);

        Comparator<Person> comparator=new Comparator<>();
        comparator.compare(person1,person2);

        Car carFerrari=new Car("Ferrari",320);
        Car carRenault=new Car("Ferrari",220);

        Comparator<Car> carComparator=new Comparator<>();
        carComparator.compare(carFerrari,carRenault);
    }



}
