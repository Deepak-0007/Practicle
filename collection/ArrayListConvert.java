package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConvert {
public static void main(String[] args) {
	//List all=new ArrayList();
	//ass element in arraylist through object
	List<String>a1=new ArrayList<String>();
	a1.add("Ritu");
	a1.add("Deepak");
	a1.add("Harinder");
	a1.add("Muskan");
	//Convertion of list to array
	System.out.println("List to Array");
	String []arr=a1.toArray(new String[a1.size()]);
	for(String s:arr) {
		System.out.println(s);
	}
//array to list
	System.out.println("Array to list");
	List<String>all=new ArrayList<String>();
	all=Arrays.asList(arr);
	System.out.println(all);
}
}
