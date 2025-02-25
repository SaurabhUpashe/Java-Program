import java.util.Scanner;
class NumerConvert 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Number");
		int no=sc.nextInt();
		int cnt=0,rev=0,rem=0;
		while(no!=0)
		{
			rev=rev*10+(no%10);
			no=no/10;
		}

		while(rev!=0)
		{
			rem=rev%10;
			switch(rem)
			{
				case 0:
					 System.out.println("Zero");
				     break;
				case 1:
					System.out.print(" one");
					 break;
				case 2:
					System.out.print(" two");
					break;
				case 3:
					System.out.print(" three");
					 break;
				case 4:
					System.out.print(" four");
					 break;
				case 5:
					System.out.print(" five");
					break;
				case 6:
					System.out.print(" six");
					break;
				case 7:
					System.out.print(" seven");
					break;
				case 8:
					System.out.print(" eight");
					break;
				case 9:
					System.out.print(" nine");
					break;
			}
			rev=rev/10;
		}
	}
}
