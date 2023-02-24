package method_overlaoding;
// chnaging the data type

public class method_over2 {
	static int sum(int a, int b) {
		return a+b;
	}
	static double sum(double a,double b) {
		return a+b;
	}
	public static void main(String args[]) {
		System.out.println(method_over2.sum(5,6));
		System.out.println(method_over2.sum(5.1,6.2));
	}

}
