import java.io.BufferedReader;
import java.io.InputStreamReader;
class Arithmatic
{
	public static void main(String []args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int p=0,n=0;
		float r=0.0f,si=0.0f;

		System.out.println("Enter the Value of p: ");
		p=Integer.parseInt(br.readLine());

		System.out.println("Enter Year: ");
		n=Integer.parseInt(br.readLine());

		System.out.println("Enter R(Rate of Interrest): ");
		r=Float.parseFloat(br.readLine());

		si=p*r*n/100;

		System.out.println("Simple Interest is : "+si);
	}
}
