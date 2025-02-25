//  WAP to display all Multiples of 3 and 5 nos from 1-100 no

class UsingForLoop1
{
	public static void main(String []args)
	{
		for(int i=0;i<100;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println("Multiply no:  "+i);
			}
		}
	}
}