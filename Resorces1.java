class MyStream implements AutoCloseable
{
	public void close()
	{
		System.out.println("Stream Close Succesfully: ");
	}
}
class Resorces1 
{
	public static void main(String[] args) 
	{
		try(MyStream ob = new MyStream())
		{
			
		}
		catch (Exception e)
		{
		}
		
	}
}
