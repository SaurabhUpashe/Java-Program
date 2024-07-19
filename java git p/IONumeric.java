import java.io.BufferedReader;
import java.io.InputStreamReader;
class IONumeric
{
	public static void main(String []args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int x=0;
		float y=0.0f;
		double z=0.0;

		System.out.println("Enter The Integer number");
		x=Integer.parseInt(br.readLine());
		
		System.out.println("Enter The float number");
		y=Float.parseFloat(br.readLine());

		System.out.println("Enter The double number");
		z=Double.parseDouble(br.readLine());
		
		System.out.print("x="+x+"\t y="+y+"\t z="+z);
	}
}