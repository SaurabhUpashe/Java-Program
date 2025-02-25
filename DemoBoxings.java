class DemoBoxings 
{
	public static void main(String[] args) 
	{
		float d = 23.45f;
		Float ob = new Float(d);//Boxing

		float value = ob.floatValue(); // unboxing
		System.out.println("Double value: "+value);

		Integer ob1 =10; //Autoboxing
		System.out.println(ob1);

		int x = ob1; //unboxing
		System.out.println(x);
	}
}
