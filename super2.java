class name1 {
    String name ="Nitesh";    
    }
class department extends name1{
    void print(){
        System.out.println(super.name);
        System.out.println("Department of nitesh is DCSA");
        
            }
            void display(){
                System.out.println("project of nitesh is on the base of Machine Learning");
            }
}
public class super2 {
    public static void main(String[] args) {
        department obj=new department();
        obj.print();
        obj.display();
    }
    
}
