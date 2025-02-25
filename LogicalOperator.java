import java.io.InputStreamReader;
import java.io.BufferedReader;
class LogicalOperator
{
	public static void main(String []args)
	{
		int x=0,y=0,z=0;
		Boolean b=true;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try
		{
			System.out.println("Enter The Any 3 value");
			x=Integer.parseInt(br.readLine());
			y=Integer.parseInt(br.readLine());
			z=Integer.parseInt(br.readLine());
		}
		catch(Exception e){}
		
		b=(x>y&&y<z);
		System.out.println("B is: "+b);

		b=(x<y && y>z);
		System.out.println("B is: "+b);

		b=(x>=y || z<=y);
		System.out.println("B is: "+b);

		b=(x>z && x==y);
		System.out.println("B is: "+b);

		b=(y>z && z<=y);
		System.out.println("B is: "+b);

		b=(y>=x || z>=x);
		System.out.println("B is: "+b);


		
	}
}