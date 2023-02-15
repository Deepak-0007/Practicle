class inheritence1{
    void animal(){
      System.out.println("dog is barking");    
    }
}
class inheritence2 extends inheritence1{
    void animal2(){
        System.out.println("dog is animal");
    }
}
class inherritence{
 public static void main(String[] args) {
inheritence2 in=new inheritence2();
    in.animal();
    in.animal2();
    }
       
    }
