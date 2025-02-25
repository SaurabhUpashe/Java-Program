import java.util.*;
class AddArrayListElement 
{
	public static void main(String[] args) 
	{
		ArrayList <String> arrayList =  new ArrayList<>(9);
		arrayList.add("c++");
		arrayList.add("Java");
		arrayList.add("python");
		arrayList.add(0, "c");
		System.out.println(arrayList);

		ArrayList<String> a1 = new ArrayList<>();
		a1.add("Android");
		a1.add("Ruby");
		a1.addAll(arrayList);//
		System.out.println(a1);

		ArrayList <String>  a2 = new ArrayList<>();
		a2.add("HTML");
		a2.add("CSS");
		a2.addAll(a1);
		a2.add(4,"JavaScript");
		System.out.println(a2);

		String str = a1.set(5,"Oracle");
		System.out.println("A1 is: "+a1);
		System.out.println("Set Return Replace Element: "+str);
	}
}
