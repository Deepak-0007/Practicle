package Collection;
import java.util.HashSet;
public class HashsetDemo {
public static void main(String[] args) {
	HashSet<String>h=new HashSet();
	h.add("hello");
	h.add("Welcome");
	h.add("to");
	h.add("world");
	h.add("of");
	h.add("java");
	// oringinal h
	System.out.println("Orignal set "+h);
	h.remove("java");
	// after remove 
	System.out.println("after removing "+h);
	HashSet set1=new HashSet();
	set1.add("DBMS");
	set1.add("java programming");
	System.out.println("after adding new set "+set1);
	h.addAll(set1);
	System.out.println("update set "+h);
	h.removeAll(set1);
	h.clear();
	System.out.println("after removing "+h);
}
}
