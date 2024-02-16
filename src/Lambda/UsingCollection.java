package Lambda;

import java.util.ArrayList;
import java.util.List;

//It is very useful in collection library.
//It helps to iterate, filter and extract data from collection.
public class UsingCollection {
	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<String>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("mango");
		
		fruits.forEach(n->System.out.println(n));
	}

}
