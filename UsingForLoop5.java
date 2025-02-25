 // Enter the number and add the alternate digit from it

import java.util.Scanner;
class UsingForLoop5
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int no=0,s1=0,s2=0,flg=0,rem=0;
		System.out.println("Enter any No: ");
		no=sc.nextInt();

		for(;no!=0;)
		{
			rem=no%10;
			if(flg==0)
			{
				s1=s1+rem;
				flg=1;
			}
			else
			{
				s2=s2+rem;
				flg=0;
			}
			no=no/10;
		}

		System.out.println("S1 sum is: "+s1+"\t S2 sum is: "+s2);
		
		
	}
}