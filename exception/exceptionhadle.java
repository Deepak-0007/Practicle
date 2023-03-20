package exception;

public class exceptionhadle {
public void display() {
	try {
		int i =50/0;
		System.out.println(i);
		
	}
	catch(Exception e) {
		System.out.println(e);
		System.out.println("invalid divison");
	}
}
public static void main(String[] args) {
	exceptionhadle eg=new exceptionhadle();
	eg.display();
}
}
