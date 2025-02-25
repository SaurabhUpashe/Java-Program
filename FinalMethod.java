class Animal
{
    final void sound(){
		System.out.println("Animal sounds");
	}
}
class Dog extends Animal
{
	//void sound(){// error: sound() in Dog cannot override sound() in Animal overridden method is final
	//	System.out.println("Dog bark");
	//}
}
class FinalMethod 
{
	public static void main(String[] args) 
	{
		Dog ob = new Dog();
		ob.sound();
	}
}
