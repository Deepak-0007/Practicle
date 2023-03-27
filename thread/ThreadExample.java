public class ThreadExample extends Thread{
    // creating thread by extending class
    public void run(){
        System.out.println("i am thread ....thread is running");
    }
    public static void main(String[] args) {
        ThreadExample t = new ThreadExample();
        t.start(); // mpve the thread to start
        t.setName("hello");
        String s= t.getName();
        System.out.println(s);
    }
}
