class Myclass
{
	public String toString()
	{
		return "Printing Object Info";
	}
}
class ObjectRepresentation1 
{
	public static void main(String[] args) 
	{
		Myclass mob = new Myclass();
		System.out.println("Object Info: "+mob);//result: Object Info: Printing Object Info
	}
}
