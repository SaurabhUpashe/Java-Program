class ObjectClassMethod 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Object ob=  new Object();

		System.out.println("Direct Print Object: "+ob);
		System.out.println("tostring(): "+ob.toString());
		System.out.println("hasCode(): "+ob.hashCode());
		System.out.println("getClass(): "+ob.getClass());

		String str = new String("Hello");
		System.out.println("equalsTo:  "+ob.equals(str));

		String str1 = new String("Hello");
		System.out.println("equalsTo:  "+str.equals(str1));

		Object ob1 = ob;
		System.out.println("equalsTo:  "+ob.equals(ob1));

		
	}
}
