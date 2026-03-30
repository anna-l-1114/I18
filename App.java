public class App {
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat("Whiskers", 3);
        Dog dog = new Dog("Buddy", 5);

        cat.makeSound();
        dog.makeSound();
    }
}
