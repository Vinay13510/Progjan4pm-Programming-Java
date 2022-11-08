import java.util.Scanner;
public class BiggestOfThree {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter 3 integers:");
	int x=s.nextInt();
	int y=s.nextInt();
	int z=s.nextInt();
	if(x>y)
	{
		if(x>y&&x>z)
		{
		System.out.println(x + "is biggest");
		}
		elseif(y>z)
			System.out.println(z+ "is biggest");
		}
		if(y>z)
		{
			System.out.println(y+ "is biggest");
		}
		else {
			System.out.println(z +"is biigest");
		}
	}
	
}
}
