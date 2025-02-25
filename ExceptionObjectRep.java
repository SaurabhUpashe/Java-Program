class Demo extends Exception
{
	String exp_info;
	public Demo(String msg)
	{
		exp_info = msg;
	}
	public String toString()
	{
		return exp_info;
	}
}
class ExceptionObjectRep 
{
	public static void main(String[] args) 
	{
		Demo ob = new Demo("Exception can not be Eliminated: ");
		System.out.println("Object Info: "+ob);
	}
}
