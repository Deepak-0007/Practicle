package IOStream;

import java.io.*;
class student implements Serializable{
	int Srno;
	String name;
	int fee;
	public student(int Srno,String name,int fee) {
		this.Srno=Srno;
		this.name=name;
		this.fee=fee;
	}
}
public class ObjectOutputStreamEg {
public static void main(String[] args) {
	try {
	student s=new student(1,"Deepak",2000);
	FileOutputStream fout=new FileOutputStream("C:\\Users\\Tech Solution\\Desktop\\Question3.txt");
	ObjectOutputStream obj=new ObjectOutputStream(fout);
	obj.writeObject(s);
	obj.close();
	System.out.println("done");
}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
