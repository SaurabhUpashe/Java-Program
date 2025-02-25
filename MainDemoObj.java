class DemoObj
{
	public void showMessage()
	{
		System.out.println("It's Anonymous object: ");
	}
	public void Input()
	{
		System.out.println("It's Anonymous object in Input Method: ");
	}
}
class  MainDemoObj
{
	public static void main(String[] args) 
	{
		new DemoObj().showMessage();
		new DemoObj().Input();
	}
}
