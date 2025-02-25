import java.util.function.Function;
class FunctionInterfaceExample 
{
	public static void main(String[] args) 
	{
		Integer [] arr = {11,22,66,75,96,74};
		Function<Integer[],Integer> ob = n ->{//First Integer[] is taking type and Second
											 // Integer is return type;
			int tot=0,i=0;
			while(i<n.length)
			{
				tot=tot+n[i];
				i++;
			}
			return tot;
		};
		
		System.out.println("Addition of Array: "+ob.apply(arr));
	}
}
