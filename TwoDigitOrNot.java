import java.util.Scanner;
public class TwoDigitOrNot {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter one integer:");
	int x=s.nextInt();
	
	if(x>-9&&x<=-99&&x>9&&x<=99)
	{
		System.out.println(x+ " is  two digit number..");
	}
		/*else if(x>9&&x<=99){
			System.out.println(x+ " is  two digit number..");
		}*/
			else {
				System.out.println(x+ " is  not two digit number..");
			}
		}
	}
	


