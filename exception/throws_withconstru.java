public class throws_withconstru{
    String name;
    int age;
    public throws_withconstru(String name,int age){
        this.name=name;
        this.age=age;
        if(age<18){
            throw new ArithmeticException(name+" are not a voter" +age);
        }
        else {
            System.out.println(name+" are a voter" +age);
        }
    }
    public static void main(String[] args)throws Exception {
        throws_withconstru obj=new throws_withconstru("Deepak", 25);

    }
}