// Using Insertion technic

import java.util.Scanner;
class InsertStartPosEnd
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner (System.in);
		int pos=0,no=0,i;
		
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
			System.out.println("\n 1.Insert Start \t 2.Insert Any Position \t 3.Insert End \t 4.Display \t 5.Stop");
			System.out.println("Enter Your Option: ");
			int opt=sc.nextInt();

			switch(opt)
			{
				case 1: 
					if(cnt<arr.length)
					{
						for(i=cnt;i>=1;i--)
						{
							arr[i]=arr[i-1];
						}
						System.out.println("Enter the insert no:");
						arr[0]=sc.nextInt();
						cnt++;
					}
					else
					{
						System.out.println("Array size is full Unable to Insert Element");
					}
					break;
				
				case 2:
					System.out.println("Enter your positon: ");
					pos=sc.nextInt();
					if(pos>cnt)
					{
						System.out.println("Array size is full!!!!!!!: ");
					}
					else if(pos<0 && pos> cnt)
					{
						System.out.println("Incorrect position!!!!");
					}
					else
					{
						if(pos==cnt)
						{
							System.out.println("Enter your Insert no: ");
							arr[pos]=sc.nextInt();
						}
						else
						{
							for(i=cnt;i>=pos;i--)
							{
								arr[i]=arr[i-1];
							}
							System.out.println("Enter you Insert no: ");
							arr[pos]=sc.nextInt();
							cnt++;
						}
					}
					break;
	
				case 3:
					if(cnt>arr.length)
					{
						System.out.println("Array size is full!!!!!!!: ");
					}
					else
					{
						System.out.println("Enter you Insert no: ");
						arr[cnt]=sc.nextInt();
						cnt++;
					}
					break;

				case 4:
					System.out.println("Array Element Are: ");
					for(i=0;i<cnt;i++)
					{
						System.out.print("   "+arr[i]);
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