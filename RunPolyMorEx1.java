class Shape
{
	public void area()
	{
		System.out.println("In Shape Area()");
	}
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
class  RunPolyMorEx1
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
	}
}
