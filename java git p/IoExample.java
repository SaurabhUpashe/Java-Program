import java.io.BufferedReader;
import java.io.InputStreamReader;
class IoExample
{
	public static void main(String[]args)
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		try
		{
			System.out.println("Enter The Data: ");
			String str=br.readLine();
			System.out.println("Data is: "+str);
		}
		catch(Exception e)
		{
		}
	}
}