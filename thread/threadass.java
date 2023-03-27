public class threadass {
   
    public static void main(String[] args) {
        Thread t=new Thread("hello");
        Thread t1=new Thread("java");
        t.start();
        t1.start();
        
        System.out.println("thread 1 "  + t.getName());
        System.out.println("threas 2 "   + t1.getName());
    }
}
