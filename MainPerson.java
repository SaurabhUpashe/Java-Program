import java.io.*;
class Person
{
	private String name;
	private int age;
	private double height;

	public void setPersonInformation()throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the name: ");
		name=br.readLine();

		System.out.println("Enter the age: ");
		age=Integer.parseInt(br.readLine());

		System.out.println("Enter the height: ");
		height=Double.parseDouble(br.readLine());
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public Double getHeight()
	{
		return height;
	}
}
class  MainPerson
{
	public static void main(String[] args)throws Exception
	{
		Person p1 = new Person();
		p1.setPersonInformation();

		Person p2 = new Person();
		p2.setPersonInformation();

		System.out.println("Name: "+p1.getName()+"\t Age:"+p1.getAge()+"\t Heigth: "+p1.getHeight());
		System.out.println("Name: "+p2.getName()+"\t Age:"+p2.getAge()+"\t Heigth: "+p2.getHeight());
	}
}
