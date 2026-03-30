// implemented by Anna

public class Cat extends Animal {

    // constructor
    public Cat(String name, int age){
        super(name, age);
    }
    
    // prints meow
    @Override
    public void makeSound(){
        System.out.println("meow");
    }
    
}
