package String;
import java.util.Scanner;
public class stringtest {
	String x="hello";
public void show() {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    String A=sc.next();
    String B=sc.next();
    System.out.println(A.length()+B.length());//user input
    System.out.println(A.compareTo(B)>0 ? "yes" : "NO");
    System.out.println(A.substring(0,4).toUpperCase()+A.substring(2)+ " "+B.substring(0,3).toLowerCase()+B.substring(1));
    // Substring(),upper case ,lower case java
   System.out.println("Substring is : " +x.substring(0,3));
   System.out.println("Substring is :" +x.substring(2));
}
public static void main(String[] args) {
	stringtest t=new stringtest();
	t.show();
}
}
