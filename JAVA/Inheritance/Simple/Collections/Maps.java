package Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.*;

public class Maps {
	
	public static void main(String[] args) {
		HashMap<Integer, String> m = new HashMap<>();
		
		m.put(1, "Ashu");
		m.put(2, "Ashu");
		m.put(4, "Abhi");
		m.put(3, "Sonu");
		System.out.println(m);
		
		
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();

		lhm.put(1, "John");
		lhm.put(12, "Jane");
		lhm.put(9, "Mike");
		lhm.put(14, "Mary");
		lhm.put(10, "Brad");
	

		System.out.println(lhm);
		
		TreeMap<Integer, String> tm = new TreeMap<>();

		tm.put(100, "John");
		tm.put(12, "Jane");
		tm.put(9, "Mike");
		tm.put(14, "Mary");
		tm.put(10, "Brad");
		tm.put(18, "Tom");
		tm.put(16, "Pierce");
		tm.put(27, "Chris");
		tm.put(35, "Roy");
		tm.put(43, "John");

		System.out.println(tm);
		
		
		
	}
	
	

}
