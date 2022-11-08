import java.util.Scanner;
public class RectangleOrSquare {
 public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter length:");
	double length=s.nextDouble();
	System.out.println("enter breadth:");
	double breadth=s.nextDouble();
	if(length==breadth)
	{
		System.out.println("the rectangle is square..");
		
	}
	else {
		System.out.println("the rectangle is not a square..");
	}
	
}
}
