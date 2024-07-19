import java.io.BufferedReader;
import java.io.InputStreamReader;
class SecondBuffer 
{
	public static void main(String[] args) 
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);

		try
		{
			System.out.println("Enter the Data: ");
			String s=br.readLine();
			System.out.println("String is: "+s);
		}
		catch (Exception e)
		{
		}

	}
}
