import java.util.Scanner;
public class DivisibleBy5$11 {

	public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         System.out.println("enter one integer:");
     	int x=s.nextInt();
     	if(x%5==0&&x%11==0)
     	{
     		System.out.println(x+ " is divisible by 5 and 11 ");
     	}
     	else {
     		System.out.println(x+ " is not divisible by 5 and 11");
     	}
	}

}
