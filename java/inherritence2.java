class car{
    void car_name()
    {
        System.out.println("audi is a car");
    }
}
    class model extends car{
        void car_model(){
            System.out.println("modle name Q2");
        }
    }
    class price extends model{
        void car_price(){
    System.out.println("price is too expensive");
        }
    }
class imformation extends price {
    void all_imforamtion (){
     price imformation2 = new price();
     imformation2.car_name();
     imformation2.car_model();
     imformation2.car_price();

    }
}
public class inherritence2 {
public static void main(String[] args) {
    imformation i=new imformation();
    i.all_imforamtion();

}    
}
