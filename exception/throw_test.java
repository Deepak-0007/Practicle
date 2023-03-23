package exception;

public class throw_test {
public static void display(int marks) {
	if(marks<60) {
		throw new ArithmeticException("studendt is not eligilbe");
	}
	else {
		System.out.println("you are eligible for the class");
	}
}
public static void main(String[] args) {
	display(70);
}
}
