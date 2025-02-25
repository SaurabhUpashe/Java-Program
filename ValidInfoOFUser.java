class InvalidEntityException extends Exception
{
	public InvalidEntityException(String msg)
	{
		super(msg);
	}
	public String toString()
	{
		return "My exception: ";
	}
}
class Entitys
{
	private String name;
	private int age;
	public Entitys(String nm,int age)//throws Exception
	{
		name=nm;
		this.age=age;
		try
		{
			if(name==null || name.isEmpty())
			{
				throw new InvalidEntityException("Name can not Null or Empty");
			}
			if(age<0)
			{
				throw new InvalidEntityException("Age can not Negative or Null");
			}
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
}
class  ValidInfoOFUser
{
	public static void main(String[] args) 
	{
		
		try
		{
			Entitys ob = new Entitys("Saurabh",-30);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

		System.out.println("==========================");

		try
		{
			Entitys ob = new Entitys("",25);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

		System.out.println("==========================");

		try
		{
			Entitys ob = new Entitys("Saurabh",24);
			System.out.println("Name is: "+ob.getName());
			System.out.println("Age is: "+ob.getAge());
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		//System.out.println("Hello World!");
	}
}
