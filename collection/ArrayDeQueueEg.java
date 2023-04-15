package Collection;
import java.util.ArrayDeque;
import java.util.Deque;
public class ArrayDeQueueEg {
public static void main(String[] args) {
	Deque<String>dq=new ArrayDeque<String>();
	dq.add("Ram");
	dq.add("shyam");
	dq.add("mohit");
	dq.add("lokesh");
	dq.add("aryan");
	dq.add("honey Singh");
	System.out.println(dq);
	dq.addFirst("Deepak");
	dq.addLast("yadav");
	System.out.println("new list");
	for(String s:dq) {
		System.out.println(s);
	}
	dq.removeFirst();
	dq.removeLast();
	System.out.println("new list after removing");
	for(String s2:dq) {
		System.out.println(s2);
	}
}
}
