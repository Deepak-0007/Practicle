class thread_even_odd extends Thread{
    public void run(){
        for (int i=1;i<100;i++){
            try{
                if(i%2==0){
                    System.out.println( i+" is number is even ");
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public void run(int j){
        for (j=1;j<100;j++){
            try{
                if(j%2==1){
                    System.out.println( j+" is number is odd ");
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        thread_even_odd t=new thread_even_odd();
        thread_even_odd t1=new thread_even_odd();
        
        t.start();
        try{
            t.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        t1.start();
    }
}