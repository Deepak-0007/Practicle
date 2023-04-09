package collectionEg;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUsingDefinedC1 {
	public static void main(String[] args) {
		
Bank b=new Bank(12345,"Mamta",5000.20, 20);
Bank b1=new Bank(12354,"Ram",7000.00, 21);
Bank b2=new Bank(12344,"Karan",4000.00, 30);
Bank b3=new Bank(12333,"Priya",5004.00, 55);
ArrayList<Bank>a1=new ArrayList<Bank>();
a1.add(b);
a1.add(b1);
a1.add(b2);
a1.add(b3);

Iterator itr=a1.iterator();
while(itr.hasNext()) {
	Bank obj=(Bank)itr.next();
	System.out.println(obj.accountNo+" "+obj.customerName+" "+obj.balance+" "+obj.customerAge);
}
}
}
