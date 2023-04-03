package thread_example;
// with wait ,with notify, notify all
class Sysnc1{
	int i;
	boolean flag=false;
	synchronized void display(int i) {
		if(flag)
			try {
				wait();
			}
		catch(Exception e) {
	System.out.println(e);
		}
		this.i=i;
		flag=true;
		System.out.println("Data displayed "+i);
		notify();
	}
	synchronized int receive() {
		if(!flag) 
			try {
				wait();
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("Data Recieve"+i);
			flag=false;
			notify();
			return i;
		
	}
}
class Thread10 extends Thread{
	Sysnc1 obj;
	Thread10(Sysnc1 obj){
		this.obj=obj;
	}
	public void run() {
		for(int j=1;j<=10;j++) {
			obj.display(j);
		}
	}
}
class Thread20 extends Thread{
	Sysnc1 obj;
	Thread20(Sysnc1 obj){
		this.obj=obj;
	}
	public void run() {
		for(int j=1;j<=10;j++) {
			obj.receive();
		}
	}
}
public class inter_thread_comm {
	public static void main(String[] args) {
		Sysnc1 obj=new Sysnc1();
		Thread10 t=new Thread10(obj);
		Thread20 t1=new Thread20(obj);
		t.start();
		t1.start();
		
	}

}
