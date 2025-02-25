import java.io.InputStreamReader;
import java.io.BufferedReader;
class AssignOperater
{
	public static void main(String []args)
	{
		int x=0,y=0;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
 
		try
		{
			System.out.println("Enter the Any Two Value");
			x=Integer.parseInt(br.readLine());
			y=Integer.parseInt(br.readLine());
		}
		catch(Exception e){}

		System.out.println("Before Exchange Value: ");
		System.out.println("x="+x+"\t y="+y);

		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("Exchange Value: ");
		System.out.println("x="+x+"\t y="+y);


	}
}