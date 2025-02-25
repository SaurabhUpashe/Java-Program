 // WAP to find the missing digits from the number


import java.util.Scanner;
class UsingWhileLoop2
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int no=0,flg=0,rem=0;
		System.out.println("Enter any No: ");
		no=sc.nextInt();
		
		int tmp=no;
		int dg=0;
		while(dg<=9)
		{
			no=tmp;
			flg=0;
			while(no!=0)
			{
				rem=no%10;
				if(rem==dg)
				{
					flg=1;
					break;
				}
				no=no/10;
			}
			if(flg==0)
			{
				System.out.println(" "+dg);
			}
			dg++;
		}
	}
}