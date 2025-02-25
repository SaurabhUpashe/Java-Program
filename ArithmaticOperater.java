import java.io.InputStreamReader;
import java.io.BufferedReader;
class ArithmaticOperater
{
	public static void main(String []args)
	{
		float farhenhite=0.0f;
		double celcius=0.0;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		try
		{
			System.out.println("Enter the Farhenhite: ");
			farhenhite=Float.parseFloat(br.readLine());
		}
		catch(Exception e)
		{
		}
		
		celcius=(farhenhite-32)*1.8;

		System.out.println("Celcuis is: "+celcius);
		
	}
}