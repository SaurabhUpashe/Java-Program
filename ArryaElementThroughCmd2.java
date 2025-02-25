//Taking for()each loop Command line Array Argument

class ArryaElementThroughCmd2
{
	public static void main(String []saurabh)
	{
		int []arr = new int[saurabh.length];
	
		System.out.println("Array "+saurabh.length+" Element:");
		int i=0;
		for(String s : saurabh)
		{
			arr[i]=Integer.parseInt(s);
			i++;
		}

		for(int sa : arr)
		{
			System.out.print("   "+sa);
		}
	}
}