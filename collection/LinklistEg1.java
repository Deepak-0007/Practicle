package collection;
import java.util.Iterator;
import java.util.LinkedList;
public class LinklistEg1 {
	public static void main(String[] args) {
		LinkedList<String>l1=new LinkedList<String>();
		l1.add("Minsh");
		l1.add("Monu");
		l1.add("Ajay");
		l1.add("Rishi");
		l1.add("Rahul");
		System.out.println(l1);
		Iterator<String>itr=l1.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		// adding an element at the specific position 
		l1.add(2,"Nisha");
		System.err.println("After adding "+ " "+l1);
		LinkedList<String>l2=new LinkedList<String>();
		l2.add("Sonu");
		l2.add("Ramu");
		l2.add("Bhanu");
		l2.add("Gyanu");
		//print all the element of to l2
		System.out.println("elements of list 2 " +l2 );
		l1.addAll(l2);
		// adding all the element of the l2 to l1
		System.err.println("After adding l1 and l2 together"+l1);
		//add first position of the l2
		l2.addFirst("Deepak");
		System.err.println("Adding the element of the first postion" +l2);
		l1.addAll(2, l2);
		System.err.println("after adding the all element of 2 positon of l1"+l1);
		l2.addLast("Sunil");
		System.err.println("After adding the last element of the list "+l2);
	}

}
