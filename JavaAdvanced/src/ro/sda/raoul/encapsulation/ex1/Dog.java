package ro.sda.raoul.encapsulation.ex1;

//Create class Dog.
//a) Add private fields to the class, like name, age, gender, race, weight.
//b) Create constructor that accepts all of the class fields.
//c) Create additional constructor, that will accept only gender and race. It should call main constructor with default values.
//d) Create getters and setters for age and weight.
//e) Create object of class Dog. Verify if everything works as expected.
//f) Add verification for all arguments passed to the setters. E.g. setWeight method should not accept values below or equal to 0.
public class Dog {

    private String name;
    private int age;
    private String gender;
    private String race;
    private double weight;

    public Dog(String name, int age, String gender, String race, double weight) {
        this.name = name;
        if (age < 0) {
            System.err.println("Invalid age.");
        } else {
            this.age = age;
        }
        this.gender = gender;
        this.race = race;
        if (weight < 0) {
            System.err.println("Invalid weight.");
        } else {
            this.weight = weight;
        }
    }

    public Dog(String gender, String race) {
        this("Rex", 5, gender, race, 20.1);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.err.println("Invalid age.");
        } else {
            this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 0) {
            System.err.println("Invalid weight.");
        } else {
            this.weight = weight;
        }
    }

    @Override
    public String toString() {
        return "ro.sda.raoul.encapsulation.ex1.Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", race='" + race + '\'' +
                ", weight=" + weight +
                '}';
    }
}
