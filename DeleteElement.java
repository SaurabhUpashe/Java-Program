// Using Delete Element

import java.util.Scanner;
class DeleteElement
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner (System.in);
		int pos=0,no=0,i,tmp;
		
		int []arr =  new int [100];
	
		System.out.println("Array is "+arr.length+" size");

		System.out.println("Enter your length that is minimum to "+arr.length+" size");
		int cnt=sc.nextInt();

		System.out.println("Enter the "+cnt+" Array Element: ");
		for(i=0;i<cnt;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("Array Element: ");
		for(i=0;i<cnt;i++)
		{
			System.out.println("  "+arr[i]);
		}
		
		while(true)
		{
			System.out.println("****Menu*****");
			System.out.println("\n 1.Delete Start \t 2.Delete Any Position \t 3.Delete End \t 4.Display \t 5.Stop");
			System.out.println("Enter Your Option: ");
			int opt=sc.nextInt();

			switch(opt)
			{
				case 1: 
					if(cnt<arr.length)
					{
						tmp=arr[0];
						for(i=0;i<cnt;i++)
						{
							arr[i]=arr[i+1];
						}
						cnt--;
						System.out.println("Delete Element is: "+tmp);
					}
					else
					{
						System.out.println("Array size is full Unable to Insert Element");
					}
					break;
				
				case 2:
					System.out.println("Enter your positon: ");
					pos=sc.nextInt();
					if(pos<0 && pos> cnt)
					{
						System.out.println("Incorrect position!!!!");
					}
					else
					{
						tmp=arr[pos];
						for(i=0;i<pos;i++)
						{
							arr[i]=arr[i+1];
						}
						cnt--;
						System.out.println("Delete Element is :"+tmp);
					}
					break;
	
				case 3:
					if(cnt>arr.length)
					{
						System.out.println("Array size is full!!!!!!!: ");
					}
					else
					{
						tmp=arr[cnt-1];
						cnt--;
						System.out.println("Delete Element is :"+tmp);
					}
					break;

				case 4:
					if(cnt<=0)
					{
						System.out.println("Array is Empty: ");
						System.exit(0);
					}
					else
					{

						System.out.println("Array Element Are: ");
						for(i=0;i<cnt;i++)
						{
							System.out.print("   "+arr[i]);
						}
					}
					break;
				case 5:
					System.exit(0);
				default :
					System.out.println("Please Enter the Correct Option: ");
					break;
					
			}
		}
	
	}
}