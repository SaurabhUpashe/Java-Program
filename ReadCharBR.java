import java.io.*;
class ReadCharBR
{
	public static void main(String []args)throws Exception
	{
		char ch='p';
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the Charcher: ");
		ch=br.readLine().charAt(0);

		System.out.println("Charcter is: "+ch);
	}
}