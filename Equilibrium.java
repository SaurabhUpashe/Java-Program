import java.util.Scanner;
class Equilibrium 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter yout Number count: ");
		int cnt=sc.nextInt();

		int arr[] = new int[cnt];
		System.out.println("Enter Array Element: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		//int left=0;
		//int right=arr.length-1;
		for(int i=1;i<arr.length-1;i++)
		{
			int leftsum=0;
		    int rightsum=0;
			int left=0;
			int right=arr.length-1;
			while(left<i)
			{
				leftsum=leftsum+arr[left]; 
				left++;
			}
			while(right>i)
			{
				rightsum=rightsum+arr[right];
				right--;
			}

			if(leftsum==rightsum)
			{
				System.out.println("Equilibrium point: "+i);
			}
		}
		
	}
}
