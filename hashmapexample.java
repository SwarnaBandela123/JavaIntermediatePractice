package hashmap;

import java.util.HashMap;

public class hashmapexample {
public static void main(String arg[]) {
	HashMap<String, Integer> HM=new HashMap<>();// Declaration of HashMap
	
	HM.put(null, null);
	HM.put("Harsha", 99);
	HM.put("Veerababu", 90);
	HM.put("Konda", 85);
	HM.put("Sai Kiran", 80);
	HM.put("Durga", 98);
	HM.put("Swarna", 90);
	
System.out.println("HashMap size:"+ HM.size());
}
}
