interface Calculate
{
	int cal(int a,int b);
}
class FunctionalInterface 
{
	public static void main(String[] args) 
	{
		Calculate add = new Calculate(){
			public int cal(int a, int b)
			{
				return a+b;
			}
		};
		System.out.println("Addition is : "+add.cal(10,20));
	}
}
