public Class SmallCat extends Cat {
	
	public SmallCat(String name, int age) {
		super(name, age)
	}
	
	public makeSound() {
		System.out.println(this.getName() + " says meow...");
	}
}