//Taking a Array Elemnt throught Commandline

class ArryaElementThroughCmd
{
	public static void main(String []args)
	{
		int []arr = new int[args.length];

		System.out.println("Array "+args.length+" element: ");
		for(int i=0;i<args.length;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
		}
	
		for(int i=0;i<args.length;i++)
		{
			System.out.print("  "+arr[i]);
		}
	
		
	}
}