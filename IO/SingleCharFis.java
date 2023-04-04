package IO;
import java.io.FileInputStream;
public class SingleCharFis {
public static void main(String[] args) {
	try {
		FileInputStream f=new FileInputStream("C:\\Users\\Tech Solution\\Desktop\\hello.txt");
		int i=f.read();// to read single char of the file
		System.out.println((char)i);
		f.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
