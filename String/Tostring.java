package String;
// represent any object to string
public class Tostring {
 int rollno; // intger type variable
 String name,addr;// string
 Tostring(int rollno ,String name, String addr){
	 this.rollno=rollno;
	 this.name=name;
	 this.addr=addr;
	 
 }
 public String toString() { // return object to string
	 //return super.toString();// object to string
	 return rollno+" "+name+" "+addr;
	 
 }
 public static void main(String[] args) {
	Tostring s1=new Tostring(1,"ram","Mumbai");// return the hashcode
	Tostring s2=new Tostring(2,"karan","Delhi");
	System.out.println(s1);//compiler write s1.tostring()
	System.out.println(s2);
}
}
