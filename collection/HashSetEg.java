package Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class HashSetEg {
	// alowing null value
public static void main(String[] args) { //creating hashset 
	Set<String>s4=new HashSet<String>();//
	s4.add("hello");
	s4.add("the ");
	s4.add("world ");
	s4.add("of ");
	s4.add("java");
	s4.add(null);
	s4.add("hello");
	Iterator<String>itr=s4.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
