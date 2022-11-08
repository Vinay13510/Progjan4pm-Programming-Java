import java.util.Scanner;

public class NoDivisibleBy3$5Couple{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter one  number..:");
		int x=s.nextInt();
		if(x%3==0) 
		{
			System.out.println("sanju");
			if(x%5==0)
			{
				System.out.println("geetha");
				if(x%3==0&&x%5==0)
				{
					System.out.println("sanju weds geetha");
				}
				else {
					System.out.println("Breakup..");
				}
			}

		}

	}

}
