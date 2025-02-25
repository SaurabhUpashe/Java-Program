interface Demo
{
	//int add(int x,int y,int z); passing argument and return 
	int add();//only return not passing value
}
class ReturnWithLamdaExpression  
{
	public static void main(String[] args) 
	{
		//Demo ob = (a,b,c) -> a+b+c;
		//System.out.println("Addition is : "+ob.add(10,20,25));

		Demo ob = () -> {
			int a = 30,b=50;
			return a+b;
		};
		System.out.println("Addition is : "+ob.add());
	}
}
