package Programs;
import java.util.Scanner;

public class student {
	private int rollno;
	private String name;
	student(){
		
	}
	student(int rollno, String name){
		this.rollno=rollno;
		this.name=name;
	}
	
	void setData(Scanner sc) {
		System.out.println("enter roll no");
		 this.rollno = sc.nextInt();
//		 sc.nextLine();
		System.out.println("enter name");
		 this.name = sc.next();
		
	}
	
	void displayData() {
		System.out.println("Student roll no is : "+this.rollno);
		System.out.println("Student name is : "+this.name);
		
	}
		public static void main(String[] args) {
			Scanner sc  = new Scanner(System.in);
			
//			System.out.println("enter name");
//			 String name = sc.nextLine();
//			System.out.println("enter roll no");
//			 int roll = sc.nextInt();
			 
			
			 
			
			
			student st = new student();
			st.setData(sc);
			st.displayData();
					
		}

	}
