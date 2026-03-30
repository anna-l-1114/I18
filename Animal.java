public abstract class Animal{
    private String name;
    private int age;

    // constructor
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();
}