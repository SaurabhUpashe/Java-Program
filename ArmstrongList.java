// Find Armstrong no in the array

import javax.swing.JOptionPane;
class ArmstrongList
{
	public static void main(String []args)
	{
		int []arr = new int [10];
		
		
			
		int i,sum,ans,rem=0,cnt=0;;
		for(i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter the "+arr.length+" Array Element: "));
			
		}

		System.out.println("Armstrong Numbers: ");
		for(i=0;i<arr.length;i++)
		{
			int no=arr[i];
			sum=0;
			cnt=0;
			while(no!=0)
			{
				cnt++;
				no=no/10;
			}
		
			no=arr[i];
			while(no!=0)
			{
				rem=no%10;
				ans=1;
				for(int j=0;j<cnt;j++)
				{
					ans=ans*rem;
				}
				sum=sum+ans;
				no=no/10;
			}
			if(sum==arr[i])
			{
				System.out.print("  "+arr[i]);
			}
		}



	}
}