import java.util.Scanner;
class Person
{
	private String name;
	private int age;
	private double hie;

	public void setPersonDetails()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Name: ");
		name=sc.nextLine();

		System.out.println("Enter your Age: ");
		age=sc.nextInt();

		System.out.println("Enter your Hieght: ");
		hie=sc.nextDouble();
	}
	public void showPerosnDetails()
	{
		System.out.println("Name: "+name+"\t Age: "+age+"\t Heigth: "+hie);
	}
}

class  MainClassExample
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		p1.setPersonDetails();
		p1.showPerosnDetails();

		Person p2 = new Person();
		p2.setPersonDetails();
		p2.showPerosnDetails();
	}
}
