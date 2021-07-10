package Programs;

import java.util.Scanner;

public class mlarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int array1[]=new int[5];
		int array2[]=new int[5];
		String result = "";

		System.out.println("Enter the first array element");
		for (int i = 0; i < 5; i++)
		{
			array1[i]=sc.nextInt();
			
		}
		System.out.println("Enter the second array element");
		
			for (int i = 0; i < 5; i++)
			{
				array2[i]=sc.nextInt();
				
			}
			for (int i = 0; i < 5; i++) {
				int num1 = array1[i];
				int num2 = array2[i];
				result += Integer.toString(num1 * num2) + " "; 
			}
		System.out.println("\nResult: "+result); 
	}
}

			
