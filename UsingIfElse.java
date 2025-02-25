import java.util.Scanner;
class UsingIfElse
{
	public static void main(String []args)
	{
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any No: ");
		no=sc.nextInt();

		if(no%2==0)
		{
			System.out.println("No is Even: ");
		}
		else
		{
			System.out.println("No is Odd: ");
		}
	}
}