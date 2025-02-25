abstract class Shape
{
	abstract public void area();
}
class React extends Shape
{
	public void area()
	{
		System.out.println("In React Area()");
	}
}
class Tringle extends Shape
{
	public void area()
	{
		System.out.println("In Tringle Area()");
	}
}
class Circle extends Shape
{
	public void area()
	{
		System.out.println("In Circle Area()");
	}
}
class Parabola extends Shape
{
	public void findarea()
	{
		System.out.println("In Parabola findArea()");
	}
	public void area()
	{
		System.out.println("In Parabola Area()");
	}
}
class  RunPolyMorEx2
{
	public static void main(String[] args) 
	{
		Shape ref;

		ref=new React();
		ref.area();

		//or

	    ref=new Tringle();
		ref.area();

		//or

		ref= new Circle();
		ref.area();

		//or

		ref = new Parabola();
		ref.area();
	}
}
