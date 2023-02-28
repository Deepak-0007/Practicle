 class binding{
     void display(){
        System.out.println("hello");
     }
    }
    class binding2 extends binding{
        void display(){
            System.out.println("i am there");
        }
    }
    class testbinding{
public static void main(String[] args) {
binding d = new binding2();
d.display();
    
}
 }