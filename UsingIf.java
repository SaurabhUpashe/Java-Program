import java.util.Scanner;
class UsingIf
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int no=0;
		
		System.out.println("Enter any Value: ");
		no=sc.nextInt();

		if(no%2==0)
		{
			System.out.println("No is Even:");
		}
		if(no%2!=0)
		{
			System.out.println("No id odd");
		}
		


	}
}