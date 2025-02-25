import java.util.Scanner;
class MergeSort 
{
	public static void conquer(int arr[],int si,int mid,int ei)
	{
		int merge[] = new int[ei-si+1];
		int index1 =si ;
		int index2 =mid+1;
		int x=0;
		while(index1<=mid && index2<=ei)
		{
			if(arr[index1]<=arr[index2])
			{
				merge[x]=arr[index1];
				x++;
				index1++;
			}
			else
			{
				merge[x]=arr[index2];
				x++;
				index2++;
			}
		}

		while(index1<=mid)
		{
			merge[x]=arr[index1];
			x++;
			index1++;
		}

		while(index2<=ei)
		{
			merge[x]=arr[index2];
			x++;
			index2++;
		}

		// mergering array assign to orignal Array
		for(int i=0,j=si;i<merge.length;i++,j++)
		{
			arr[j]=merge[i];
		}

	}
	public static void dived(int arr[],int si,int ei)//si=starting index ,ei=ending index;
	{
		if(si>=ei)
		{
			return;
		}
		int mid = (si+ei)/2;
		dived(arr,si,mid);
		dived(arr,mid+1,si);

		conquer(arr,si,mid,ei);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int []arr = new int[5];
		int n = arr.length;
		System.out.println("Enter the "+arr.length+" Element: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		dived(arr,0,n-1);

		System.out.println("Merge Sorting: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("  "+arr[i]);
		}
	}
}
