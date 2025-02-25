class MyStream implements AutoCloseable
{
	public void out()
	{
		System.out.println("Stream Closed Sucessfully");
	}
}
class StreamClose
{
	public static void main(String[] args) 
	{
		//MyStream s = new MyStream();
		try(MyStream s = new MyStream())
		{
			
		}
		catch (Exception e)
		{
		}
	}
}
