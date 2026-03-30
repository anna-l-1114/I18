// Implemented by: Colby
public class SmallCat extends Cat {

	public SmallCat(String name, int age) {
		super(name, age);
	}

	@Override
	public void makeSound() {
		System.out.println(this.getName() + " says meow...");
	}
}
