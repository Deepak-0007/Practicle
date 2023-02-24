package method_overlaoding;
// chnaging no. of argument 
public class method_overloading1 {
	static int sum(int a, int b) {
		return a+b;
	}
	static int sum(int a,int b, int c) {
		return a+b+c;
	}
	public static void main(String args[]) {
		System.out.println(method_overloading1.sum(5,6));
		System.out.println(method_overloading1.sum(5,6,11));
	}

}
