package collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
public class ArrayListMethod {
public static void main(String[] args) {
	List<String>a1=new ArrayList<String>();
	a1.add("ram");
	a1.add("sur");
	a1.add("sarika");
	a1.add("ajay");
	a1.add("har");
	a1.add("dee");
Collections.sort(a1);
System.out.println("traversing using for loop");
for(int i=0;i<a1.size();i++) {
	System.out.println(a1.get(i));
	String element=a1.get(2);// get method
	System.out.println("get index "+element);
	System.out.println("Array list is "+a1.isEmpty());
	String element1=a1.remove(4);// remove
	System.out.println("Remove index "+element1);
	System.out.println("traversing using for loop");
	for ( i=0; i<a1.size();i++) {
		System.out.println(a1.get(i));
	}
}
}
}
