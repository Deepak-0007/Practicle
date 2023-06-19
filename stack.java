package Collection;
import java.util.Stack;
public class stack {
	public static void main(String[] args) {
		Stack <Integer> stk=new Stack();
		stk.push(79);
		stk.push(78);
		stk.push(77);
		stk.push(76);
		stk.push(75);
		stk.pop();
		System.out.println("Element in the stack is " +stk);
	}

}

