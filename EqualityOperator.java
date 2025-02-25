import java.io.InputStreamReader;
import java.io.BufferedReader;
class EqualityOperator
{
	public static void main(String []args)
	{
		int x=0,y=0;
		Boolean b=true;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try
		{
			System.out.println("Enter The Any 2 value");
			x=Integer.parseInt(br.readLine());
			y=Integer.parseInt(br.readLine());
		}		
		catch(Exception e){}
		
		b=(x==y);
		System.out.println("B is: "+b);

		b=(x!=y);
		System.out.println("B is: "+b);	
	}
}