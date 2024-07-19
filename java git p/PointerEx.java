import java.util.Scanner;
class PointerEx
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your count:");
		int cnt=sc.nextInt();

		int []x=new int[cnt];

		System.out.println("Enter the "+cnt+" Element");
		for(int i=0;i<x.length;i++)
		{
			x[i]=sc.nextInt();
		}
		System.out.println("Array Element");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(" "+x[i]);
		}
		
	}
}
