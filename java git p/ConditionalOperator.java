import java.util.Scanner;
class ConditionalOperator
{
	public static void main(String[]args)
	{
		int x,y,max;

		Scanner sc=new Scanner (System.in);
		x=sc.nextInt();
		y=sc.nextInt();

		max=(x>y)?x:y;

		System.out.println("Max no is :- "+max);
	}
}