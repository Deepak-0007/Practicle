package Collection;
import java.util.PriorityQueue;
import java.util.Iterator;
public class PriorityQueueeg {
public static void main(String[] args) {
	PriorityQueue<String> que=new PriorityQueue<String>();
	que.add("Deepak");
	que.add("ajay");
	que.add("rahul");
	que.add("Ravi");
	System.out.println("head "+que.element());
	System.out.println("Queue "+que);
	System.out.println("head "+que.peek());
	System.out.println("Queue"+que);
	System.out.println("Iterating the elements");
	Iterator itr=que.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());}
	System.out.println("head poll "+que.poll());
	System.out.println("Queue "+que);
	System.out.println("head remove" +que.remove());
	System.out.println("Queue "+que);
	System.out.println("after removing");
	Iterator<String>itrl=que.iterator();
	while(itrl.hasNext()) {
		System.out.println(itrl.next());
	}

}	
}
