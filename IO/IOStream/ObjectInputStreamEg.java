package IOStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Students implements Serializable{//serializable interface
	int id;
	String name;
	int fees;
	public Students(int id,String name,int fees) {//pera constructor
this.id=id;
this.name=name;
this.fees=fees;
	}
}
public class ObjectInputStreamEg {
public static void main(String[] args) {
try {
ObjectInputStream st= new ObjectInputStream(new FileInputStream("C:\\Users\\Tech Solution\\Desktop\\Question3.txt"));
Students s=(Students) st.readObject();//to read the object output stream class
System.out.println("ID is: "+s.id+"\nname is: "+s.name+"\nfees is: "+s.fees);
st.close();
}catch(Exception e) {
	System.out.println(e);
}
}
}