package Collection;
import java.util.Iterator;
import java.util.TreeSet;
public class Treeseteg {
public static void main(String[] args) {
	//creating and adding elements
	TreeSet<String> set =new TreeSet<String>();
	set.add("A");
	set.add("N");
	set.add("D");
	set.add("Q");
	set.add("S");
	set.add("T");
	set.add("J");
	set.add("F");
	set.add("G");
	set.add("A");
	set.add("V");
	set.add("C");
	set.add("R");
	System.out.println("original set "+set);
	//traversing elements through iterator in
	Iterator itr=set.descendingIterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		System.out.println("Lowest Value "+set.pollFirst());
		System.out.println("After poll updated set "+set.pollLast());
		System.out.println("reverse sets "+set.descendingSet());
		System.out.println("head sets "+set.headSet("Q"));
		System.out.println("sub set "+set.subSet("J", "R"));
		System.out.println("Tail set "+set.tailSet("S"));
	}
} 
}
