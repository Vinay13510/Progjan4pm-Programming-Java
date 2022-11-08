import java.util.Scanner;

public class SmallestOne {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter three integers:");
		int x=s.nextInt();
		int y=s.nextInt();
		int z=s.nextInt();
		if(x<y&&x<z)
		{
			System.out.println(x +" is small number.. ");
		}
		else if(y<z) {
			System.out.println(y +" is small number..");
		}  
		else {
			System.out.println(z +" is small number..");
		}
	}

}
