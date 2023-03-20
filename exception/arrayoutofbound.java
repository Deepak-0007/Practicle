package exception;

public class arrayoutofbound {
	public void display() {
		try {
			int arr[]= new int[3];// index of arry 
			arr[5]=7;// array out bound conditon id apply
			System.out.println(arr);// print array 
		}
		catch(Exception e) { // catch block to catch exception 
			System.out.println(e);// print exception
		}
		System.out.println("here is the error solution");
	}
public static void main(String[] args) { // main method
	arrayoutofbound eg=new arrayoutofbound(); // object
	eg.display();
}
}
