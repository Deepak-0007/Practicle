package thread_example;

public class Runnableinterface2 extends Thread {
	public void run() {
		System.out.println("hello i am  ..... Deepak");
	}
	public static void main(String[] args) {
		Runnableinterface2 ri=new Runnableinterface2();
		ri.run();
	}
}
