import java.io.InputStreamReader;
import java.io.BufferedReader;
class UnaryTypeCast
{
	public static void main(String []args)throws Exception
	{
		int x=0,y=0;
		float z=0.0f;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		x=Integer.parseInt(br.readLine());
		y=Integer.parseInt(br.readLine());

		z=x/y;
		System.out.println("Z is: "+z);

		z=x/(float)y;
		System.out.println("Z is: "+z);

		z=(float)x/y;
		System.out.println("Z is: "+z);

		z=(float)x/(float)y;
		System.out.println("Z is: "+z);
				
	}
}