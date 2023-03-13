package String;

public class string2 {
	public void show() { //method 1

		char[] arr={'d','e','e','p','k'};
		System.out.println(arr);
		String s=new String(arr);
		System.out.println("value is  "+s);//"deepk
		}
	public void myfun() {//method 2
		String s1="deepak";
		String s2=new String(s1);
		System.out.println(s2);//deepak
	}
		
		public static void main(String[] args) {
			string2 str=new string2();
		str.show();
		str.myfun();
		}
		

}
