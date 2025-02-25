 // WAP to display the list of Armstrong numbers from range 10 - 10000


import java.util.Scanner;
class UsingWhileLoop4
{
	public static void main(String []args)
	{
		int i,ans,sum,rem=0,cnt;
		
		for(i=0;i<1000;i++)
		{
			int no=i;
			cnt=0;
			sum=0;
			while(no!=0)
			{	
				rem=no%10;
				cnt++;
				no=no/10;
			}			
			
			while(no!=0)
			{
				rem=no%10;
				ans=1;
				for(int j=1;j<=cnt;j++)
				{
					ans=ans*rem;
				}
				sum=sum+ans;
				no=no/10;
			}
			no=i;
			if(no==sum)
			{
				System.out.println(" "+no);
			}
		}		
		
	}
}