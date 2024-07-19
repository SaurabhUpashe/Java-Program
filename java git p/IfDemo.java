
import java.io.BufferedReader;
import java.io.InputStreamReader;

class IfDemo
{
	public static void main(String[]args)
	{
		int no=0;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
                
		System.out.println("Enter Any Number");
		try{no=Integer.parseInt(br.readLine());}catch(Exception e){}

		if(no%5==0)
		{
			System.out.println("No is Divisble by 5");
		}
		else
		{
			System.out.print("No is not Divisble by 5");
		}
	}
}