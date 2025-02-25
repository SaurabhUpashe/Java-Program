class Demo
{
    final public int x;
	public Demo(){
		x=10;
	}
	public Demo(int a)
	{
		x=a;
	}
	//public void setx()
	//{
		//x=1000;
	//}
	public void display(){
		System.out.println("X is: "+x);
	}			
}
class  FinalRefernceType
{
	public static void main(String[] args) 
	{
		final Demo ob1 = new Demo(100);
		Demo ob2 = new Demo(200);

		ob1.display();
		ob2.display();

		//ob1=ob2; // error : coz if final veriable is refernce type (object),the refernce cannot change
	    
		//ob1.setx();// you cant change refernce but you can change object state (value);	
		ob1.display();
	}
}
