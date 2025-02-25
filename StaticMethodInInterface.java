interface MathOperation
{
	static int add(int a,int b)
	{
		return a+b;
	}
		
	static int multi(int x,int y)
	{
		 return x*y;
	}
		
}
class  StaticMethodInInterface
{
	public static void main(String[] args) 
	{
		System.out.println("Addition is: "+MathOperation.add(5,3));
		System.out.println("Multification is: "+MathOperation.multi(5,3));
	}
}
