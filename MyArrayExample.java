import java.util.Scanner;
class MyArray
{
	private int []x;
	public void in()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Element Count: ");
		int k=sc.nextInt();

		x=new int[k];

		System.out.println("Enter the "+k+" Element");
		for(int i=0;i<x.length;i++)
		{
			x[i]=sc.nextInt();
		}
	}
	public void out()
	{
		System.out.println("Array Element Are: ");
		for(int i=0;i<x.length;i++)
		{
			System.out.print("  "+x[i]);
		}
	}

	public void matchingArrayElement(int arr[])
	{
		int flg=0;
		if(arr.length==x.length)
		{
			flg=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]!=x[i])
				{
					flg=1;
					break;
				}
			}
		}
		else
		{
			flg=1;
		}
		if(flg==0)
		{
			System.out.print("Array is Matching: ");
		}
		else
		{
			System.out.print("Array is not Matching: ");
		}
	}
	public boolean numberPresent(int no)
	{
		for(int i=0;i<x.length;i++)
		{
			if(x[i]==no)
			{
				return true;
			}
		}
		return false;
	}
	public void sortArray()
	{
		for(int i=0;i<x.length-1;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]>x[j])
				{
					int tmp=x[i];
					x[i]=x[j];
					x[j]=tmp;
				}
			}
		}
	}
}
class MyArrayExample 
{
	public static void main(String[] args) 
	{
		MyArray ob = new MyArray();

		ob.in();
		ob.out();

		int []arr = new int[5];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the "+arr.length+" Element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println();
		ob.matchingArrayElement(arr);

		System.out.println("Enter Any Number: ");
		int no=sc.nextInt();

		System.out.println();
		if(ob.numberPresent(no)==true)
		{
			System.out.println("Number is Present in Array");
		}
		else
		{
			System.out.println("Number is not Present in Array");
		}

		ob.sortArray();
		System.out.println("Sorted Array: ");
		ob.out();

	}
}
