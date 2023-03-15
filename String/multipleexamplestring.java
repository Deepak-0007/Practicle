package String;
// append , //insert ,replace delete ,reverse - mutable class (string builder and string buffer)
public class multipleexamplestring {// class name 
public static void my() { //method 
	StringBuffer s=new StringBuffer("hello");// object of string buffer class
	s.append("World"); // for join
	System.out.println("String id : " +s); // hello world
	s.insert(2,"Deepak");// int off set string s
	System.out.println("insert is : " + s);//hrDeepakllo world
	s.replace(1,3,"java");   //begin with and wnd with string
	System.out.println("replace is :" +s ); 
	System.out.println("capasity is: " +s);
	// string builder 
	StringBuilder s1=new StringBuilder("World"); // s1= world 
	s1.replace(1, 3, "java");   //
	System.out.println("replace is :" +s1); // wjavald
	s1.delete(1, 3);                   
	System.out.println("delete is :" +s1);//wvald
	s1.reverse(); 
	System.out.println("reverse is :" +s1);  //dlavw
}
public static void main(String[] args) {
	my();
}
}
