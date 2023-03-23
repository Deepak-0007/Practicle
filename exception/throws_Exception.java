package exception;

public class throws_Exception {
	public static void display(int a) throws ArithmeticException{ // using thorws exception
		if(a<35) { // condition
			throw new ArithmeticException("you are fail");// throw excetption
		}
		else {
			System.out.println("you are pass");
		}
	}
public static void main(String[] args) { //main method
	display(32);
}
}
