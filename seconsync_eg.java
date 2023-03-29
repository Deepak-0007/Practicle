package thread_example;

 class seconsync_eg1 {
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
 public class seconsync_eg{
	 public static void main(String[] args) {
	 seconsync_eg1 obj =new seconsync_eg1();
		
		 Thread t1=new Thread(){
		 public void run() {
			 obj.print(2);
		 }
	 };
	
	 Thread t2=new Thread() {
	 public void run() {
		 obj.print(5);
	 }
	 };
	 t1.start();
	 t2.start();
}
	 }

 

