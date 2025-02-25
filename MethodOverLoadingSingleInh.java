class Base
{
	public int add(int a , int b)
	{
		return a+b;
	}
		
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
}
class  MethodOverLoadingSingleInh
{
	public static void main(String[] args) 
	{
		Base ob = new Base();
		System.out.println("Addition of Two Number: "+ob.add(5,10));
		System.out.println("Addition of three Number: "+ob.add(5,10,15));
	}
}
