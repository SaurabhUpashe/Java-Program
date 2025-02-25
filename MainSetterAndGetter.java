import java.util.Scanner;
class SetterAndGetter
{
	private int id;
	private int age;
	private double per;
	public void setId(int id)
	{
		this.id=id;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setPer(double per)
	{
		this.per=per;
	}
	public int getId()
	{
		return id;
	}
	public int getAge()
	{
		return age;
	}
	public double getPer()
	{
		return per;
	}
}
class MainSetterAndGetter 
{
	public static void main(String[] args) 
	{
		SetterAndGetter s1 = new SetterAndGetter();

		Scanner sc = new Scanner(System.in);
		s1.setId(111);
		s1.setAge(23);
		s1.setPer(89.23);
		System.out.println("\n ID: "+s1.getId()+"\t Age: "+s1.getAge()+"\t Pecentage: "+s1.getPer());

		SetterAndGetter s2 = new SetterAndGetter();
		s2.setId(112);
		s2.setAge(25);
		s2.setPer(90.26);
		System.out.println("\n ID: "+s2.getId()+"\t Age: "+s2.getAge()+"\t Pecentage: "+s2.getPer());

		System.out.println("Details of Elder Student: ");
		if(s1.getAge()>s2.getAge())
			System.out.println("\n ID: "+s1.getId()+"\t Age: "+s1.getAge()+"\t Pecentage: "+s1.getPer());
		else
			System.out.println("\n ID: "+s2.getId()+"\t Age: "+s2.getAge()+"\t Pecentage: "+s2.getPer());
		
	}
}
