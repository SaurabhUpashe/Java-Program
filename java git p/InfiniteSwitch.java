import java.util.Scanner;
class InfiniteSwitch
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int opt=0;
		int x=0,y=0,ans=0;
	
		while(true)
		{
			System.out.println("****Menu****");
			System.out.println("1.Add \t 2.Sub \t 3.Multi \t 4.Div \t 5.stop");
			System.out.println("Enter Your Option");
			opt=sc.nextInt();
			System.out.println("Enter The X and Y value");
			x=sc.nextInt();
			y=sc.nextInt();

			if(opt==5)
				break;

			switch(opt)
			{
				
				case 1:
					ans=x+y;
					System.out.println("Addition Is: "+ans);
					break;

				
				case 2:
					ans=x-y;
					System.out.println("Subtraction Is: "+ans);
					break;
				
				case 3:
					ans=x*y;
					System.out.println("Multification Is: "+ans);
					break;
				
				case 4:
					ans=x/y;
					System.out.println("Division Is: "+ans);
					break;
				default:
					System.out.println("Incorrect Option!!!!");
			}
	
		}

	}

}