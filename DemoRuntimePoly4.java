 abstract class Shape
{
	abstract public void area();
}
class Rect extends Shape
{
	public void area()
	{
		System.out.println("In Rect area()");
	}
}
class Triangle extends Shape
{
	public void area()
	{
		System.out.println("In Triangle area()");
	}
}
class Circle extends Shape
{
	public void area()
	{
		System.out.println("In Circle area()");
	}
}
class Parabola extends Shape
{
	public void findarea()
	{
		System.out.println("In Parabola area()");
	}
	public void area()
	{
		System.out.println("In para area()");
	}
}
class DemoRuntimePoly4
{
	public static void main(String []args)
	{
		// rather than creating the complex architecture to decide the which shape,
		// lets go for the possiblities.

		Shape ref;

		ref=new Rect(); 
		ref.area(); 

		// OR

		ref=new Circle(); 
		ref.area(); 

		// OR

		ref=new Triangle(); 
		ref.area(); 

		// OR

		ref=new Parabola (); 
		ref.area(); 
	}
}