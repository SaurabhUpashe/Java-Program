class Animal
{
	void eat()
	{
		System.out.println("Animal is Eating: ");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog is barking: ");
	}
}
class Human extends Animal
{
	void speak()
	{
		System.out.println("Human is speaking: ");
	}
}
class  MainSingleInh
{
	public static void main(String[] args) 
	{
		Animal ob = new Animal();
		ob.eat();
		
		System.out.println("\n -------------------------");

		Dog dob = new Dog();
		dob.bark();
		dob.eat();

		System.out.println("\n -------------------------");

		Human hob = new Human();
		hob.eat();
		hob.speak();

	}
}
