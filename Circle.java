	import java.util.Scanner;
          public class Circle {
           public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("enter the radius of the circle:");
			double r=s.nextDouble();
			
			System.out.println(r+"radius of the circle area is: "+22/7*r*r);
			System.out.println(r+"radius of the circle circumference is: "+2*22/7*r);
			
		}
}
