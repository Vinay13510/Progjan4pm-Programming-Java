import java.util.Scanner;
public class NoOrDigit {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter 3 integers:");
	int x=s.nextInt();
	
	if(x>-9&&x<=9)
	{
	 System.out.println("hey man it is digit");	
	}
         else{
            System.out.println("number");
}

}
}
