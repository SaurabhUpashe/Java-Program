
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class DemoIOException 
{
	public static void main(String[] args)
	{
		int x=0,y=0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the X and Y value: ");
		try{
			//br.close();
			x=Integer.parseInt(br.readLine());
			y=Integer.parseInt(br.readLine());
			int z=x/y;
		}
		catch(IOException e)
		{
			System.out.println("Exception is occured in program");
		}
		catch(Exception e)
		{
			System.out.println("Exception is diffrent: ");
		}
		//catch(NumberFormatException e)
		//{
		//	System.out.println("Exception Occures Due to non-numric input");
		//}		
		System.out.println("X is: "+x);
	}
}
