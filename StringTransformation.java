/*
class ChocolateDistribution 
{
	public static int MiniNoOFChocolate(int x[])
	{

	}
	public static void main(String[] args) 
	{
		int choclate[] = new int[5];
		for(int i=0;i<choclate.length;i++)
		{
			choclate[i]=sc.nextInt();
		}

		int ans=MiniNoOFChocolate(choclate);
		
		System.out.println("Hello World!");
	}
}
*/
import java.util.Scanner;
class StringTransformation 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String");
		String str=sc.nextLine();

		char []ch=str.toCharArray();

		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a')
			{
				ch[i]='b';
			}
			else if(ch[i]=='b')
			{
				ch[i]='a';
			}
		}
		str=new String(ch);
		System.out.println(""+str);
	}
}