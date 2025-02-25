interface Myinterface
{
	void show();
}
class LamdaExpression 
{
	public static void main(String[] args) 
	{
		/*Myinterface ob =() ->{
				System.out.println("Class Implementing MyInterface");
			};
		ob.show();*/

		//here removing {} braces and ; beacuse only one method so its implicity handle this
		Myinterface ob =() ->System.out.println("Class Implementing MyInterface");
		ob.show();
	}
}
