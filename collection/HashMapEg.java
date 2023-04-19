package Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class HashMapEg {
public static void main(String[] args) {
	Map<Integer,String> mp=new HashMap<Integer,String>();
	// adding elements
	mp.put(101,"Mango");
	mp.put(102,"Null");
	mp.put(200,"Apple");
	mp.put(100,"Lichi");
	mp.put(null, null);
	System.out.println(mp);
// traversing elements in any order	
	for(Map.Entry en:mp.entrySet()) {
		System.out.println(en.getKey() + " " +en.getValue());
	}
}
}