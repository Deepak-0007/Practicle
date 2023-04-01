package thread_example;
// interthread communication program
class A{
	int num;
	boolean ValueSet = false; // a=10;
	public synchronized void put(int num) {
		while(ValueSet) {//a=20
			try {wait();
			}
			catch(Exception e) {}
		}
			System.out.println("Put" +num);
			this.num=num;
			ValueSet=true;
			notify();
		}
	public synchronized void get(int num) {
		while(!ValueSet) {
			try { wait();
			}
			catch(Exception e) {}
		}
			System.out.println("Get" +num);
			this.num=num;
			ValueSet=false;
			notify();
			}
	}
class Producer implements Runnable{
	A a;
	public Producer (A a) {
		this.a=a;
		Thread t1=new Thread(this,"Producer");
		t1.start();
	}
	public void run() {
		int i =0;
		while(true) {
			a.put(i++);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {}
	}

}
}
class Consumer implements Runnable{
	A a;
	public Consumer  (A a) {
		this.a=a;
		Thread t2=new Thread(this,"Consumer");
		t2.start();
	}
	public void run() {
		int i=0;
		while(true) {
			a.get(i++);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e){}
		}
	}

}
public class main {
public static void main(String[] args) {
	A a=new A();
	new Producer(a);
	new Consumer(a);
}
}
