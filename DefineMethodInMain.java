/*class DefineMethodInMain 
{
	public static void showMessage()
	{
		System.out.println("Message: Work Hard..!! It's important");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		showMessage();
	}
}
decleared method static otherwise creat a object of class and call that method
*/class DefineMethodInMain 
{
	public void showMessage()//decleared method static otherwise
	{
		System.out.println("Message: Work Hard..!! It's important");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		DefineMethodInMain ob = new DefineMethodInMain();
		ob.showMessage();
	}
}
