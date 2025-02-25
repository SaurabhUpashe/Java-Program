 // WAP to find the entered number is Armstrong or no

import java.util.Scanner;
class UsingWhileLoop3
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int no=0,ans,rem=0,sum=0,cnt=0;
		System.out.println("Enter any No: ");
		no=sc.nextInt();
		
		int tmp=no;
		while(no!=0)
		{
			cnt++;
			no=no/10;
		}
		System.out.println("Count is: "+cnt);
		no=tmp;
		while(no!=0)
		{
			rem=no%10;
			ans=1;
			for(int i=1;i<=cnt;i++)
			{
				ans=ans*rem;
			}
			sum=sum+ans;
			no=no/10;
		}
		
		if(tmp==sum)
		{
			System.out.println("No is Armstrong");
		}
		else
		{
			System.out.println("No is not Armstrong");
		}
	}
}