package thread_example;
// as a thread we need to create thread
public class RunableInterface implements Runnable{
public void run() {
	System.out.println("i am thread runable");
}
public static void main(String[] args) {
	RunableInterface ri=new RunableInterface();
	Thread t=new Thread(ri,"Deepak");
	t.start();
	String s=t.getName();
	System.out.println(s);
}
}
