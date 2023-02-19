package assignment;

 class inher1 {
	void dispaly() {
		System.out.println("hello");
	}

}
 class inher2 extends inher1{
	 void show() {
		 System.out.println("Deepak");
	 }
 }
 public class inher{
	 public static void main(String[] args) {
		inher2 s=new inher2();
		s.dispaly();
		s.show();
		
	}
 }
