package Collection;
import java.util.Iterator;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class LinkedHasheg {
public static void main(String[] args) {
	LinkedHashSet<String>hsl=new LinkedHashSet<String>();
	hsl.add("ram ");
	hsl.add("shyam");
	hsl.add("heloo");
	hsl.add("hey ");
	hsl.add("show");
	Iterator<String> itr=hsl.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
