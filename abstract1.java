abstract class abstract2{
    abstract void display();
    }
    class abstract3 extends abstract2{
        void display(){
            System.out.println("hello here is someone");
        }
    }
    class abstract1{
public static void main(String[] args) {
abstract2 d = new abstract3();
d.display();
    
}
 }