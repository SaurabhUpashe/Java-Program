import java.io.BufferedReader;
import java.io.InputStreamReader;
class TryWithResource 
{
	public static void main(String[] args) 
	{
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			String line="";
			br.close();
			System.out.println("Enter your Line: ");
			line = br.readLine();
			System.out.println(line);
		}
		catch (Exception e)
		{
			System.out.println(" ");
			e.printStackTrace();
		}
		
		//System.out.println("Hello World!");
	}
}
