import java.util.*;
class UsingGeneric 
{
	public static void main(String[] args) 
	{
		//Use generics to specify type of element (Type safe)
		ArrayList <String> al = new ArrayList<>();
		al.add("Sauarabh");
		//al.add(23);// error: incompatible types: int cannot be converted to String
		al.add("Manthan");
		//al.add(48.23);// error: incompatible types: Double cannot be converted to String
		//al.add(true);// error: incompatible types: Boolean cannot be converted to String
		al.add("Bhakti");
		System.out.println("ArrayList: "+al);
	}
}
