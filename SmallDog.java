// Implemented by: Youssef Bey (SmallDog.java)
public class SmallDog extends Dog {

    // constructor
    public SmallDog(String name, int age) {
        super(name, age);
    }

    // prints small dog sound
    @Override
    public void makeSound() {
        System.out.println("woof woof");
    }
}
