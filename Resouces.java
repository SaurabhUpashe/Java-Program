import java.util.*;
class Members implements AutoCloseable
{
	public void close()
	{
		System.out.println("Stream Closed Saurabh");
	}
}
class Resouces 
{
	public static void main(String[] args) 
	{
		String line="hi";
		try(Members sc = new Members())
		{
			System.out.println("Enter your Line: ");
			//sc.close();
		//	line=sc.nextLine();
			System.out.println(line);
		}
		catch (Exception e)
		{
			System.out.println("Saurabh Upashe: "+e.getMessage());
		}
	}
}
