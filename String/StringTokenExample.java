package String;
import java.util.StringTokenizer;
public class StringTokenExample {// class
 public static void my() {  //my method
	 StringTokenizer st=new StringTokenizer("welcome to world, of the java");
	 while(st.hasMoreTokens()) {//conditina and logic
		 System.out.println(st.nextToken(","));
	 }
 }
 public static void main(String[] args) {
	my(); // calling class
}
}
