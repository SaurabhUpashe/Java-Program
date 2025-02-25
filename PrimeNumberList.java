// Find list of prime number

import java.io.InputStreamReader;
import java.io.BufferedReader;
class PrimeNumberList
{
	public static void main(String []args)throws Exception
	{
		int []arr = new int [10];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int i,flg;
		System.out.println("Enter 10 Array Element: ");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
			
		}

		System.out.println(" prime Number List: ");
		for(i=0;i<10;i++)
		{
			int no=arr[i];
			flg=0;
			int d=2;
			while(d<=no/2)
			{
				if(no%d==0)
				{
					flg=1;
					break;
				}
				d++;
			}
			if(flg==0 && arr[i]!=1)
			{
				System.out.print("   "+arr[i]);
			}
		}
	}
}