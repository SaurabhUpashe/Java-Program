import java.util.Arrays;
class DemoArray 
{
	public static void main(String[] args) 
	{
		int []arr = {45,85,96,12,3,74,78};
		System.out.println("Print HashCode: "+arr.toString());//Print HashCode: [I@4517d9a3
		System.out.println("=======================");
		//Display Way of Array
		//Using ForLoop
		System.out.println("Array Element Are Using for Loop");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		System.out.println("=======================");
		System.out.println("Array Element Are Using forEach");
		for(int ele : arr)
		{
			System.out.print(" "+ele);
		}
		System.out.println("=======================");

		//Sorting Method
		Arrays.sort(arr);//Sorting Array Acending Order
		for(int value : arr)
		{
			System.out.print(" "+value);
		}
		System.out.println("=======================");

		//Serching
		int no=152;
		int pos = Arrays.binarySearch(arr,no);
		System.out.println(" "+pos);
		
	}
}
