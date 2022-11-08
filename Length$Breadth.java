import java.util.Scanner;
public class Length$Breadth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the length: ");
		double length=s.nextDouble();
		System.out.println("enter breadth: ");
		double breadth=s.nextDouble();
		System.out.println(length+" length and "+breadth +" breadth rectangle area is "+ (length*breadth)); 
		System.out.println(length+" length and "+breadth +" breadth rectangle perimeter is "+ (2*(length*breadth))); 

		
	}

}
