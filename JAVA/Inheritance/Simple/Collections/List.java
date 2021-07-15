package Collections;
import java.util.*;
class List {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	ArrayList<String> list= new ArrayList<String>(); //creating arrayList
	//	LinkedList<String> list= new LinkedList<String>(); //creating array list
	//	Vector<String> list= new Vector<String>(); //creating vector
		
		Stack<String> s= new Stack<String>(); //creating stack
		s.push("Ashu");
		s.push("Abhi");
		s.push("Ankush");
		
		
//		list.add("Ashu");
//		list.add("Abhi");
//		list.add("Ankush");
		
//		Iterator itr=list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
		
//		Iterator<String>itr=s.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
			
			for (String name : s) {
				System.out.println(name);
			}
			
			
		}
					

	}

