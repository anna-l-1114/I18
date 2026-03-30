//Implemented by Colby
public Class SmallCat extends Cat {
	
	//Uses superclass constructor
	public SmallCat(String name, int age) {
		super(name, age)
	}
	
	@Override
	public makeSound() {
		System.out.println(this.getName() + " says meow...");
	}
}
