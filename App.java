// Implemented by: Youssef Bey (App.java)
public class App {
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat("Whiskers", 3);
        Dog dog = new Dog("Buddy", 5);
        LargeCat largeCat = new LargeCat("Leo", 6);
        SmallCat smallCat = new SmallCat("Mimi", 2);
        SmallDog smallDog = new SmallDog("Rocky", 1);

        cat.makeSound();
        dog.makeSound();
        largeCat.makeSound();
        smallCat.makeSound();
        smallDog.makeSound();
    }
}
