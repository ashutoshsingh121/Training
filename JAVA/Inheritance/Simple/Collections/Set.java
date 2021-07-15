package Collections;
import java.util.*;


public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> hs = new HashSet<>(); 
		hs.add(90);
		hs.add(290);
		hs.add(190);
		hs.add(490);
		hs.add(9);
		hs.add(9); //not allow duplicate value
		
		System.out.println(hs);  //construct a default hash set
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(9);
		lhs.add(29);
		lhs.add(19);
		lhs.add(49);
		lhs.add(39);
		lhs.add(19);//not allow duplicate value
		
		System.out.println(lhs); //print as it is 
		
		
		
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(9);
		ts.add(29);
		ts.add(19);
		ts.add(49);
		ts.add(39);
		
		System.out.println(ts);//print in asc order

	}

}
