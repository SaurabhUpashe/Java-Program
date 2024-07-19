class DemoLogical
{
	public static void main(String[]args)
	{
		int x=23,y=5;
		boolean b;
		System.out.println("\n x is: "+x+"\t y is: "+y);

		b=(x!=y)&&(x==y);
		System.out.println("\n ((x>y)&&(y<100)) is: "+b);

		b=(100%y==0)&&(x%2!=0);
		System.out.println("\n ((100%y==0)||(x%2!=0)) is: "+b);

		b=(x>1)||(y<1);
		System.out.println("\n ((100%y==0)||(x%2!=0)) is: "+b);

		b=!(x!=y);
		System.out.println("\n ((100%y==0)||(x%2!=0)) is: "+b);


	
	}

}