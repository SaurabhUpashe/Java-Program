import java.io.InputStreamReader;
import java.io.BufferedReader;
class ArithmaticOpertor1
{
	public static void main(String []args)throws Exception
	{
		int no=0,ans=0;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
			
		System.out.println("Enter 3 Digit No");
		no=Integer.parseInt(br.readLine());
		
		int rem=no%10;
		ans=ans+rem;
		no=no/10;

		rem=no%10;
		ans=ans+rem;
		no=no/10;

		rem=no%10;
		ans=ans+rem;
		no=no/10;

		System.out.println("Ans is : "+ans);
		
	}
}