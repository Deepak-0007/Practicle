class thiskeyword{
    int roll_no;
    String name;
    String department;

thiskeyword(int roll_no,String name,String department){
this.roll_no=roll_no;
this.name=name;
this.department=department;
}
void display(){
 System.out.println(roll_no+" "+name+" "+ department);
}
}
 public class thiskeyword1{
    public static void main(String[] args) 
        
     {
      thiskeyword s1=new thiskeyword(01,"Deepak","DCSA");
      thiskeyword s2= new thiskeyword(02,"Ajay","CSE");  
        s1.display();
        s2.display();
    }
}
