package thread_example;

 class assigment_thread1 {
	synchronized void print(int num) {
		for (int i=5; i<=10;i++) {
			System.out.println(num+i);
			try {
				Thread.sleep(500);
				
			}
			catch(Exception e) {
			System.out.println(e);
			}
		}
	}

}
class thread1 extends Thread{
	assigment_thread1 m;
	thread1(assigment_thread1 m){
		this.m=m;
	}
	public void run() {
		m.print(5);
	}
}
class thread2 extends Thread{
	assigment_thread1 m;
	thread2(assigment_thread1 m){
		this.m=m;
	}
	public void run() {
		m.print(4);
	}
}
class thread3 extends Thread{
	assigment_thread1 m;
	thread3(assigment_thread1 m){
		this.m=m;
	}
	public void run() {
		m.print(2);
	}
}
public class assigment_thread{
	public static void main(String[] args) {
		assigment_thread1 obj=new assigment_thread1();{
			thread1 t1=new thread1(obj);
			thread2 t2=new thread2(obj);
			thread3 t3=new thread3(obj);
			t1.start();
			t2.start();
			t3.start();
		}
	}
}
