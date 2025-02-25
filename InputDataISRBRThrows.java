import java.io.InputStreamReader;
import java.io.BufferedReader;
class InputDataISRBRThrows
{
	public static void main(String []args) throws Exception
	{
		int p=0,n=0;
		double r=0.0,si=0.0;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

			
		System.out.println("Enter the Amount ,number of years & Interest: ");
		p=Integer.parseInt(br.readLine());
		n=Integer.parseInt(br.readLine());
		r=Double.parseDouble(br.readLine());
	
		si=(p*r*n)/100;

		System.out.println("Simple Interest is:"+si);

	}
}