package Programs;
import java.util.Scanner;


public class sumarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int array[]=new int[5];
		int sum=0;
		System.out.println("Enter the array element");
		for (int i = 0; i < 5; i++)
		{
			array[i]=sc.nextInt();
			
		}
		for(int num:array) {
			sum=sum+num;
		}
		System.out.println("Sum of array element is---- " +sum);

	}

}
