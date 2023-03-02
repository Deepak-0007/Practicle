 class finalmethod {  // class name 
    final void display(){  // final method
        System.out.println("this is final keyword");
    }
}   
    class final_f extends finalmethod{
        public final void display(){ //try to override final method
            System.out.println("this is extend class");
        }
    }
public class final_method{// main class 
    public static void main(String args[]) {// main method 
        final_f obj=new final_f(); // creating object
        obj.display(); // display
        
    }
 }   

