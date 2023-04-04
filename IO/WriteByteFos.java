package IO;
import java.io.FileOutputStream;
public class WriteByteFos { // for writtenint the io stream
	public static void main(String[] args) {
		try {
			FileOutputStream f=new FileOutputStream("C:\\Users\\Tech Solution\\Desktop\\hello.txt");
			String s="welcome to the world of java"; // string 
			byte b[]=s.getBytes(); //convert byte code into string  
			f.write(b); // to write byte code in the string
			f.close();// close
			System.out.println("Done");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
