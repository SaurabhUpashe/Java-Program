class MethodOuter
{
	void display()
	{
		class MethodInner
		{
			void show()
			{
				System.out.println("In Method Local Inner class: ");
			}
		}
		MethodInner ob = new MethodInner();
		ob.show();
	}
	void anotherMethod()
	{
		//MethodInner ob1 = new MethodInner();//error will generate here,coz method inner class
		//ob1.show();							// accesible with in method 
	}
}