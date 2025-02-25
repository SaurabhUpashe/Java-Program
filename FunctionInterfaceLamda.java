interface Calculate
{
	int cal(int x,int y);
}
class FunctionInterfaceLamda 
{
	public static void main(String[] args) 
	{
		Calculate add = (a,b)->a+b;
		System.out.println("Add is: "+add.cal(15,5));
	}
}
