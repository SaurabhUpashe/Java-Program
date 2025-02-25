// Inter change the last and first digit of the given number

import java.io.*;
class UsingForLoop4
{
	public static void main(String []args)throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int no=0,tmp=0,rev=0,rem=0,cnt=0,i;
		System.out.println("Enter any No: ");
		no=Integer.parseInt(br.readLine());
		
		tmp=no;
		int lastDigit=no%10;
		for(;no!=0;)
		{
			rem=no%10;
			rev=rev*10+rem;
			cnt++;
			no=no/10;
		}
		
		int firstDigit=rem;

		System.out.println("Rev no: "+rev+"\t Count is: "+cnt);
	
		int nn;
		for(nn=0,i=1;rev!=0;i++)
		{
			rem=rev%10;
			if(rem==firstDigit && i==1)
			{
				nn=nn*10+lastDigit;
			}
			else if(rem==lastDigit && i==cnt)
			{
				nn=nn*10+firstDigit;
			}
			else
			{
				nn=nn*10+rem;
			}
			rev=rev/10;
		}

		System.out.println("New no is: "+nn);

		
	}
}