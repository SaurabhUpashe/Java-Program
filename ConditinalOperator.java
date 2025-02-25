import java.io.InputStreamReader;
import java.io.BufferedReader;
class ConditinalOperator
{
	public static void main(String []args)
	{
		int x=0,y=0;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try
		{
			System.out.println("Enter the Any two no: ");
			x=Integer.parseInt(br.readLine());
			y=Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			System.out.println("Exception is Occur");
		}

		int max=(x>y) ? x : y; 

		System.out.println("Max is: "+max);

	}
}