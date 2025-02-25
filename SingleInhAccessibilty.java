class Base
{
	private int x=10;
	public double y=25.23;
	int z=20; // defalut visibility modifier
	protected int p=30;
	private void setter1()
	{
		System.out.println("Private Accessibilty method: ");
	}
	protected void setter2()
	{
		System.out.println("protected Accessibilty method: ");
	}
	public void setter3()
	{
		System.out.println("public Accessibilty method: ");
	}
	void setter4()
	{
		System.out.println("default Accessibilty method: ");
	}

}
class Derived extends Base
{
	void show()
	{
		//System.out.println("X: "+x);//private members are not inheritable
		//setter1();
		setter2();
		setter3();
		setter4();
		System.out.println("Y: "+y);
		System.out.println("P: "+z);
		System.out.println("P: "+p);
	}
}
class  SingleInhAccessibilty
{
	public static void main(String[] args) 
	{
		Derived dob = new Derived();
		dob.show();

		Base ob = new Base();
		//ob.setter1();
		ob.setter2();
		ob.setter3();
		ob.setter4();
	}
}
