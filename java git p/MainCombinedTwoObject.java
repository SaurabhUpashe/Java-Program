import java.util.*;
class CombinedTwoObject
{
	private int id;
	private String nm;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name of Student: ");
		nm=sc.nextLine();
		System.out.println("Enter the Id of Student: ");
		id=sc.nextInt();
	}
	public void input(int id,String nm)
	{
		this.id=id;
		this.nm=nm;
	}
	public void show()
	{
		System.out.println("Name of Student: "+nm+"\t Id of Student: "+id);
	}
}
class MainCombinedTwoObject
{
	public static void main(String[] args) 
	{
		CombinedTwoObject s1=new CombinedTwoObject();
		s1.input();
		s1.show();

		CombinedTwoObject s2=new CombinedTwoObject();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name: ");
		String cnm=sc.nextLine();

		System.out.println("Enter the id: ");
		int cid=sc.nextInt();

		s2.input(cid,cnm);
		s2.show();


	}
}
