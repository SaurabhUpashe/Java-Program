class DemoRel
{
	public static void main(String []args)
	{
		int x=23,y=5;
		Boolean b=true;

		System.out.println("x="+x+"y="+y);

		b=x>y;
		System.out.println("(x>y)"+b);

		b=x<y;
		System.out.println("(x<y)"+b);

		b=x==y;
		System.out.println("(x==y)"+b);

		b=x!=y;
		System.out.println("(x!=y)"+b);

		b=100%y==0;
		System.out.println("(100%y==0)"+b);

		b=x%10!=0;
		System.out.println("(x%10!=0)"+b);


	}
}