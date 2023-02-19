package constractor;

public class contractor {
	contractor (){
		System.out.println("Default con");
	}
	int rollno;
	String department;
	contractor(int r,String d){
		rollno=r;
		department=d;
	}
	//defcon(){
		//System.out.println("def con");
	//}//
	void show() {
		System.out.println( rollno+" "+department);
	    			}
	public static void main(String[] args) {
		
	
	contractor d=new contractor(21,"Deepak");
	d.show();
	contractor def_con= new contractor();
	}

}
