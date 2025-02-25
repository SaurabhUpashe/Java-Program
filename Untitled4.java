 class Base
{
	void show(){
		System.out.println("Base class");
	}
}
class Derived extends Base
{
	void display(){
		System.out.println("Derived class");
	}
}
class FinalClasses
{
	public static void main(String[] args) 
	{
		Derived ob = new Derived();
		ob.show();
		System.out.println("Hello World!");
	}
}
