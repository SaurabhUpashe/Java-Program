import java.util.Scanner;
class Ladder
{
	public static void main(String[]args)
	{
		int x=0,y=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the x value");
		x=sc.nextInt();
		System.out.print("Enter the y value");
		y=sc.nextInt();

		if(x>0&&y>0)
		{
			System.out.println("\n Point present in I st qd");
		}
		else if(x>0&&y<0)
		{
			System.out.println("\n Point present in II st qd");
		}
		else if(x<0&&y<0)
		{
			System.out.println("\n Point present in III st qd");
		}
		else if(x>0&&y<0)
		{
			System.out.println("\n Point present in IV st qd");
		}
		else if(x!=0&&y==0)
		{
			System.out.println("\n Point present in x Axis");
		}
		else if(x==0&&y!=0)
		{
			System.out.println("\n Point present in y Axis");
		}
		else
		{
			System.out.println("\n Point present in Origin");
		}
		
	}
}