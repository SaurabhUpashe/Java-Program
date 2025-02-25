class Animal
{
	void sound()
	{
		System.out.println("Animal Clear Sound: ");
	}
}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("Dog Clear Sound: ");
		super.sound();// accesing the overriden method of parent class in the child class
	}
}
class  OverridingInSingleInh
{
	public static void main(String[] args) 
	{
		Animal aob = new Animal();
		aob.sound();//call the parent class method
		System.out.println("\n ========================");
		Dog dob = new Dog();
		dob.sound();// call the overriden method in child class

	}
}
