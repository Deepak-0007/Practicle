package Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class HashMap2 {
public static void main(String[] args) {
	Map<Integer,String> map=new HashMap<Integer,String>();
	// adding elements
	map.put(101,"Mango");
	map.put(102,"Null");
	map.put(200,"Apple");
	map.put(100,"Lichi");
	map.put(null, null);
// traversing elements in any order	
	for(Map.Entry en:map.entrySet()) {
		System.out.println(en.getKey() + " " +en.getValue());}
	map.putIfAbsent(102, "watermelon");
	map.putIfAbsent(103,"CutardApple");
	for(Map.Entry m:map.entrySet()) {
		System.out.println(m.getKey() + " " +m.getValue());
	}
	map.remove(103);
	System.out.println(map);
}
}
