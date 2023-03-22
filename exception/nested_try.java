package exception;

public class nested_try {
public static void main(String[] args) {
	try { // outer try 
		try { // ist inner try 
			int num=10/0;    // aritmetic exception 
		}
		catch(ArithmeticException e) { // ist cathc block 
			System.out.println(e);
		}
		try {  // 2nd try block 
		int arr[]=new int[3];  // array out index
		arr[5]=22;
		}
		catch(ArrayIndexOutOfBoundsException e) {//2nd cathc block
			System.out.println(e);
		}
		System.out.println("Both innner try done"); // print line
	}
	catch(Exception e) { // outer catch block 
		System.out.println(e); //
	}
}
}
