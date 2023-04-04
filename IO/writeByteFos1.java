package IO;
import java.io.FileOutputStream; // to get written in the io file output stream
public class writeByteFos1 {
public static void main(String[] args) {
	try {
		FileOutputStream f=new FileOutputStream("C:\\Users\\Tech Solution\\Desktop\\ye.text");
		f.write(78); // to write char in from of asiic code
		f.close(); // close 
		System.out.println("Done");
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
