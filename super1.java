class shape{
    void print(){
        System.out.println("shape is circle");
    }
}
class size1 extends shape{
    void print(){
     System.out.println("shape is triangle");
    }
    void show(){
        super.print();
        print();
    }
}
public class super1{
    public static void main(String[] args) {
        size1 s= new size1();
        s.show();
    }
}
