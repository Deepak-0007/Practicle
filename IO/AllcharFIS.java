package IO;
import java.io.FileInputStream;
public class AllcharFIS {
	public static void main(String[] args) {
		try {
			FileInputStream f=new FileInputStream("C:\\Users\\Tech Solution\\Desktop\\hello.txt");
			int i =0;
			while((i=f.read())!=-1) { // to read the all the char of the string
				System.out.println((char)i);//print all string in the form of char
			}
			f.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
