import java.util.Scanner;
class ReadCharSc
{
	public static void main(String []args)
	{
		char ch='a';
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Charcher: ");
		ch=sc.nextLine().charAt(0);

		System.out.println("Charcter is: "+ch);
	}
}