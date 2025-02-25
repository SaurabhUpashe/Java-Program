
class MainVarArgs 
{
	public void output(String... msg)
	{
		if(msg.length==0)
		{
			System.out.println("Default Argument: ");
		}
		else
		{
			for(String message : msg)
			{
				System.out.println(message);
			}
		}
	}
	public static void main(String[] args) 
	{
		MainVarArgs ob = new MainVarArgs();
		ob.output();//Default Argument;
		ob.output("name: ","Saurabh Upashe","Aitawade Khurd: ");

		MainVarArgs ob1 = new MainVarArgs();
		ob1.output();//Default Argument;
		ob1.output("name: ","Sayali Upashe","Aitawade Khurd: ");
	}
}
