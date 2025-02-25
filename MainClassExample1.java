import java.util.Scanner;
class Person
{
	private String name;
	private int age;
	private double hie;

	public void setPersonDetails(String nm,int ag,double h)
	{
		name=nm;
		age=ag;
		hie=h;
	}
	public void showPerosnDetails()
	{
		System.out.println("Name: "+name+"\t Age: "+age+"\t Heigth: "+hie);
	}
}

class  MainClassExample1
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Name: ");
		String name=sc.nextLine();

		System.out.println("Enter your Age: ");
		int age=sc.nextInt();

		System.out.println("Enter your Hieght: ");
		double hie=sc.nextDouble();
		
		Person p1 = new Person();
		p1.setPersonDetails(name,age,hie);
		p1.showPerosnDetails();

		
		System.out.println("Enter your Name: ");
		name=sc.nextLine();
		name=sc.nextLine();
		
		System.out.println("Enter your Age: ");
		age=sc.nextInt();

		System.out.println("Enter your Hieght: ");
		hie=sc.nextDouble();

		Person p2 = new Person();
		p2.setPersonDetails(name,age,hie);
		p2.showPerosnDetails();
	}
}
