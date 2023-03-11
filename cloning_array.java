package array;

public class cloning_array {
public static void main(String[] args) {
	int [] arr= {22,44,55,99,12};
	System.out.println("print main array");
	for(int i:arr) 
		System.out.println(i);
	
	int []c_arr=arr.clone();
	System.out.println("print the clone array");
	for(int i:arr) 
		System.out.println(i);
	
	System.out.println("both array is same or not");
	System.out.println(c_arr==arr);
}
}
