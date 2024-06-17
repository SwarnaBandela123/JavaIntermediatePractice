package AbstractClass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class arraylist {
public void Arraylist() {
	/* ArrayList<Integer> AL1=new ArrayList<>();
	 AL1.add(1);
	 AL1.add(10);
	 AL1.add(2);
	 AL1.add(2);
	 AL1.add(10);
	 AL1.add(3);
	 AL1.add(3);
	 AL1.add(3);
	 AL1.add(4);
	 AL1.add(5);
	 AL1.add(5);
	 
	 ArrayList<String> AL2=new ArrayList<>();
	 AL2.add("G");
	 AL2.add("E");
	 AL2.add("E");
	 AL2.add("K");
	 AL2.add("s");

	 Iterator<Integer> IAL1= new Iterator<>(AL1);
	 
	for(int i=0; i<AL1.size(); i++)
	{
	for (int j=0+i; j<AL1.size(); j++) {
		if(AL1[i]==AL1[j]) {
			AL1.remove(AL1[j]);
			
		}
	}
	}*/
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array[] array={1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5};
		HashMap<Integer, String> HM=new HashMap<>();
		HM.put(1,"AAA");
		HM.put(2,"BB");
		HM.put(3,"CC");
		HM.put(4,"DD");
		
		System.out.println(HM);
 System.out.println(HM.containsKey(2));
System.out.println(HM.containsValue("CC"));


	}

}
