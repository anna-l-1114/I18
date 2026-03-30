// Implemented by Youssef Bey
public abstract class Animal{
    private String name;
    private int age;

    // constructor
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public abstract void makeSound();
}
