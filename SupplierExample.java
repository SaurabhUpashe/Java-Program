import java.util.function.Supplier;
class SupplierExample 
{
	public static void main(String[] args) 
	{
		Supplier <Integer> ob = () -> 10+20;
		System.out.println(" "+ob.get());
	}
}
