import java.util.Scanner;
class UsingNestedIfElse
{
	public static void main(String []args)
	{
		int n1,n2,n3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Value: ");
		n1=sc.nextInt();

		System.out.println("Enter second Value: ");
		n2=sc.nextInt();

		System.out.println("Enter Third  Value: ");
		n3=sc.nextInt();

		

		if(n1>n2)
		{
			if(n1>n3)
			{
				System.out.println("N1 is max: "+n1);	
			}
			else
			{
				System.out.println("N3 is max: "+n3);
			}
		}
		else
		{
			if(n2>n3)
			{
				System.out.println("N2 is max: "+n2);
			}
			else
			{
				System.out.println("N3 is max: "+n3);
			}
		}

		
	}
}