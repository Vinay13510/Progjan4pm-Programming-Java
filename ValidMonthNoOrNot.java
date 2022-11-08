import java.util.Scanner;
public class ValidMonthNoOrNot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter one month number..:");
     	int x=s.nextInt();
		if(x<1) {
			System.out.println(" sorry.. "+ x +"  is not valid  month number rey..");
			
		}
		else if(x>12) {
			
			System.out.println(x + " is  not valid month number ..");
		}
		else {
			System.out.println(x + " is  valid month number ..");

		}
		
	}

}
