class Parent
{
	private int id;
	private String name;
	private int age;

	public Parent()
	{
		this(10,"Upashe",30);
	}
	public Parent(int id,String name)
	{
		this(id,name,35);
	}
	public Parent(int id,String name, int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public String toString()
	{
		return " ID: "+id+"\t Name: "+name+"\t Age: "+age+"]";
	}
}
class DemoConstructerChaining
{
	public static void main(String[] args) 
	{
		Parent ob = new Parent();
		Parent ob1 = new Parent(11,"Saurabh");
		Parent ob2 = new Parent(12,"Sayli",23);
		
		System.out.println(ob);
		System.out.println(ob1);
		System.out.println(ob2);
		
		System.out.println("Hello World!");
	}
}
