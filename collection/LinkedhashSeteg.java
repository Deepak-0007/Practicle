package Collection;
import java.util.Iterator;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class LinkedhashSeteg {
public static void main(String[] args) {
	LinkedHashSet<String>hsl=new LinkedHashSet<String>();
	hsl.add("one");
	hsl.add("three");
	hsl.add("five");
	hsl.add("four");
	hsl.add("two");
	System.out.println("orignal hash set "+hsl);// orignal list 
	System.out.println(hsl.remove("two"));// after removing which is in list
	System.out.println("updated list is "+hsl); // print list
	System.out.println(hsl.remove("seven"));// remove the element which is not print in the list
	System.out.println("elment which is not in list "+hsl);
}
}
