package array;

public class ClassNameArray {
	public static void main(String[] args) {
		double arr[]= {1,2,3};
		// getting class name
		Class a=arr.getClass();
		String name =a.getName();
		//print the class name
		System.out.println(a);
	}

}
