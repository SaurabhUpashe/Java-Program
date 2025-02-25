import java.util.Scanner;
class ArrayRotation 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter your Element Count: ");
		int cnt=sc.nextInt();

		int []arr = new int[cnt];
		System.out.println("Enter "+cnt+" Array Element: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter How many Time you rotate Array:  ");
		int time=sc.nextInt();

		for(int i=0;i<time;i++)
		{
			int j;
			int tmp=arr[0];
			for(j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=tmp;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
}
