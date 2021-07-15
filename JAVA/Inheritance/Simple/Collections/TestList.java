package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestList {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add("ashu");
		
		
		list.add(0, 3.0f);
		//list.remove(3);
	//	list.remove(3.0f);
	
		
		System.out.println(list);
		}

}
