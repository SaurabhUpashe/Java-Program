import java.util.ArrayList;
import java.util.List;
class  UsingSomeMethod
{
	public static void main(String[] args) 
	{
		ArrayList<String> arraylist=new ArrayList<>(9); 
		arraylist.add("C++");
		arraylist.add("Python");
		arraylist.add("Java");
		arraylist.add(0,"C");
		System.out.println("ArrayList Conatains : "+arraylist.contains("Oracle"));//False


		ArrayList <String> a1 = new ArrayList<>();
		a1.add("Android");
		a1.add("perl");
		a1.add(arraylist.toString());
		System.out.println(a1);//[Android, perl, [C, C++, Python, Java]]
		a1.addAll(arraylist);
		System.out.println(a1);//[Android, perl, [C, C++, Python, Java], C, C++, Python, Java]
		System.out.println("2 element in the a1 list : "+a1.get(2));//2 element in the a1 list : [C, C++, Python, Java]
		System.out.println("2 element in the a1 list : "+a1.get(4));//C++


		ArrayList<String> a2=new ArrayList<>(); 
		a2.add("SQL");
		a2.add("NoSQL");
		a2.addAll(1,a1);
		System.out.println("a2 contains arraylist: "+a2.containsAll(arraylist)); 		
		a2.set(5, "Oracle");
		System.out.println(a2);

		System.out.println("=======================");

		List<String> sl=a2.subList(2, 5);
		System.out.println("Sublist: "+sl);
		
		if(a2.indexOf("java")!=-1)
		{
			System.out.println("Java present at "+a2.indexOf("java")+" position");
		}
		else
		{
			System.out.println("Java is not present in the List");
		}

		a2.add("C");
		a2.add("Java");
		System.out.println(a2);

		a2.remove("C");
		System.out.println("After Remove: "+a2);
		a2.removeAll(arraylist);
		System.out.println("After Remove: "+a2);

	}
}
