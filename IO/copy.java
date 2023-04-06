import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copy {
    public static void main(String[] args) {
        try{
            FileInputStream fin =new FileInputStream("C:\\Users\\Lenovo\\Desktop\\helo.txt");
            FileOutputStream fout =new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\helo1.txt");
    byte []arr=new byte[1024];
        int l;
        while((l=fin.read(arr))>0){
            fout.write(arr);
        }
        fin.close();
        fout.close();
        System.out.println("done");

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
