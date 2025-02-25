class MethodOverloading
{
	private int x;
	private int y;
    public static int add(int x,int y)
	{
		System.out.println("1.int-int:");
		return (x+y);
	}
	 static float add(float x,int y)
	{
		System.out.println("1.Float-int:");
		return (x+y);
	}
	 static double add(double x ,int y)
	{
		System.out.println("1.Double-int:");
		return (x+y);
	}
}
class  Main
{
	public static void main(String[] args) 
	{
		MethodOverloading ob = new MethodOverloading();
		System.out.println("1.Int-Int: "+ob.add(2,5));
		System.out.println("1.Float-Int: "+ob.add(8.6f,5));
		System.out.println("1.Double-Int: "+ob.add(75.3,5));
	}
}
