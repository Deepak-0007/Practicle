package thread_example;

public class Daemon_example extends Thread {
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread().getName());
			System.out.println("i am Daemon");
		}
			else {
				System.out.println(" i am user");
			}
		}
	public static void main(String[] args) {
		Daemon_example t=new Daemon_example();
		Daemon_example t1=new Daemon_example();
		Daemon_example t2=new Daemon_example();
		t.setDaemon(true);
		t.start();
		t1.start();
		t2.start();
		
		
	}
	}


