import java.util.*;
class UsingForEachAndToArray 
{
	public static void main(String[] args) 
	{
		LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

		// 1. Print elements using forEach()
		System.out.println("Printing fruits using forEach():");
		fruits.forEach( fruit -> System.out.println(fruit));

		 // 2. Modify elements using forEach()
        System.out.println("\nModifying fruits (uppercase) using forEach():");
		fruits.forEach(fruit -> fruits.set(fruits.indexOf(fruit),fruit.toUpperCase()));
		fruits.forEach(fruit -> System.out.println(fruit));


		// 3. Convert LinkedList to Object array using toArray()
        System.out.println("\nConverting fruits to Object array using toArray():");
		Object []fruitArray = fruits.toArray();
		for(Object fruity : fruitArray)
		{
			System.out.println(fruity);
		}

		 // 4. Convert LinkedList to String array using toArray(String[])
        System.out.println("\nConverting fruits to String array using toArray(String[]):");
		String []fruitsStringArr = fruits.toArray(new String [fruits.size()]);
		for (String fruit : fruitsStringArr) {
            System.out.println(fruit);
        }
	}
}
