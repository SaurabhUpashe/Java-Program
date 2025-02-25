// we have to write program to calculate the area of circle(pi*r*r)
import java.lang.Math;
class ExampleStaticImport 
{
	public static void main(String[] args) 
	{

		double r=4;
		double area=Math.PI*Math.pow(r,3);
		System.out.println("Area is: "+area);
	}
}
