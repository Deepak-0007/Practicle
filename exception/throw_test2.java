package exception;

public class throw_test2 {
	public static void check(int n) {
		if(n<0) {
			throw new ArithmeticException("number is negative");
		}
		System.out.println("number is postive");
	}
public static void main(String[] args) {
	check(-9);
	System.out.println("code is excuted");
}
}
