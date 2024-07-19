import java.util.Scanner;
class DemoUnary
{
	public static void main(String []args)
	{
		int x=0;
		int y=0;
		int z=0;

		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();

		z=-x;
		x++;
		--y;

		System.out.println("X="+x+"y="+y+"z="+z);

		z=x++ + --y;
		
		System.out.println("X="+x+"y="+y+"z="+z);

	}
}