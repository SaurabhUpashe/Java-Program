import java.io.InputStreamReader;
import java.io.BufferedReader;
class UnaryOperater
{
	public static void main(String []args)
	{
		int a=0,b=0,c=0;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);

		try
		{	
			System.out.println("Enter Any Two Value");
			a=Integer.parseInt(br.readLine());
			b=Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			System.out.println("Exception is occur");
		}
		
		c=-a;
		System.out.println("a="+a+"\t b="+b+"\t c="+c);

		a++;
		--b;
  		System.out.println("a="+a+"\t b="+b+"\t c="+c);

		c= ++a + b--;
		System.out.println("a="+a+"\t b="+b+"\t c="+c);
		
	}
}