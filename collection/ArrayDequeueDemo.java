package Collection;
import java.util.ArrayDeque;
import java.util.Deque;
public class ArrayDequeueDemo {
public static void main(String[] args) {
	// creating and adding
	Deque<String>deque=new ArrayDeque<String>();
	deque.add("Deepak");
	deque.add("java");
	deque.add("Course");
	deque.add("full");
	deque.offerFirst("ajay");
	System.out.println("After offer First");
	//traversing
	for(String str:deque) {
		System.out.println(str);}
	deque.offerLast("amit");
	System.out.println("After offer last");
	//traversing
	for(String str1:deque) {
		System.out.println(str1);}
	//deque.peek()& deque.peekfirst same as peek()
	System.out.println( "peek "+deque.peek());
	System.out.println("peek First "+deque.peekFirst());
	System.out.println("peek Last "+deque.peekLast());
	System.out.println("after peek");
	for(String str1:deque ) {
		System.out.println(str1);
	}
	//deque.poll() & deque.pollFirst same as poll()
	System.out.println("poll: "+deque.poll());
	System.out.println("poll first: "+deque.pollFirst());
	System.out.println("poll last "+deque.pollLast());
	System.out.println("after poll");
	for (String str2:deque) {
		System.out.println(str2);
	}
}
}
