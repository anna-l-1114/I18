// Implemented by: Colby (Dog.java)

public class Dog extends Animal {
    
    // constructor
    public Dog(String name, int age){
        super(name, age);
    }
    
    // prints woof
    @Override
    public void makeSound(){
        System.out.println("woof");
    }
}
