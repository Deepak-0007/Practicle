package IO;

import java.io.*;
//read the data from my source file by using BufferdInputStream... 
public class BufferIs {
	public static void main(String[] args) {
		try {
			FileInputStream f=new FileInputStream("C:\\Users\\Tech Solution\\Desktop\\hello.txt");
			BufferedInputStream b=new BufferedInputStream(f);
			int i =0;
			while((i=f.read())!=-1) {
				System.out.println((char)i);
			}
			f.close();
			b.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	}


