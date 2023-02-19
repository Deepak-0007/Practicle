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
 class inher3 extends inher2{
	 void sh() {
		 System.out.println(" and Welcome");
	 }
 }
 public class mulinher{
	 public static void main(String[] args) {
		inher3 s=new inher3();
		s.dispaly();
		s.show();
		s.sh();
	}
 }
