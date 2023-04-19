package Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class HashMapDemo1 {
public static void main(String[] args) {
	Map<Integer,String> mp=new HashMap<Integer,String>();
	// adding elements
	mp.put(101,"Deepak");
	mp.put(102,"Rhaul");
	mp.put(200,"sadan");
	mp.put(100,"sarika");
// traversing elements in any order	
	for(Map.Entry en:mp.entrySet()) {
		System.out.println(en.getKey() + " " +en.getValue());
	}
}
}
