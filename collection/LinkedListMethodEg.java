import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListMethodEg{
    public static void main(String[] args) {
        LinkedList<String> l1=new LinkedList<String>();
        l1.add("Harinder");
        l1.add("Abhishek");
        l1.add("Deepak");
        l1.add("Ajay");
        // print all the element of the list 1
        System.out.println("List of the first element "+l1);
        // print first element of the list by using peek list
        System.out.println(l1.peek());
        // print first element of the list by using peek fist
        System.out.println(l1.peekFirst());
        // print the last element of the list by using the peek last 
        System.out.println(l1.peekLast());
        // to remove the element by using the poll
        System.out.println(l1.poll());
        System.out.println("list of element "+l1);
        //remove the last element of the list
        System.out.println(l1.pollLast());
        System.out.println("list of 1st element "+l1);
        // remove the the element of the by using pop mehtod 
        System.out.println(l1.pop());
        System.out.println("list 1 elements"+" "+l1);

    }
}