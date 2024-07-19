import java.io.BufferedReader;
import java.io.InputStreamReader;
class SecondThrows 
{
	public static void main(String[] args) 
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int x=0;
		float y=0.0f;
		double db=0.0;

		System.out.println("Enter x value : ");
		x=Integer.parseInt(br.readLine());
		System.out.println("Enter y Value : ");
		y=Float.parseFloat(br.readLine());
		System.out.println("Enter Z value : ");
		db=Double.parseDouble(br.readLine());

		System.out.println("x: "+x+"\t y: "+y+"\t db: "+db);

	}
}
