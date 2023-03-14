package String;
import java.util.Scanner;
public class equality {
public static void main(String[] args) {
	String str1,str2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	str1=sc.nextLine();
	System.out.println("Enter the Second string");
	str2=sc.nextLine();
	//if(str1.equals(str2))   //equals campre first and second
	// if (str1==str2)    //== compare reference
	if(str1.compareTo(str2)>0)  // compare lexicographically
		System.out.println("equal");
	else
		System.out.println("unequal");
}
}
