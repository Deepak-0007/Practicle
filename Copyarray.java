package array;

public class Copyarray {
public static void main(String[] args) {
	// declaring array  
	char[]copyfrom= {'D','e','e','p','a','k'};
	// decalring another for copy
	char[]copyto=new char[7];//new array
	System.arraycopy(copyfrom,0,copyto,0,5);// predefing mehtod
    System.out.println(String.valueOf(copyto));
    //print in next array after converting char to String bcs value of is String predefine method
}
}
