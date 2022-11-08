import java.util.Scanner;
public class SumOfDigitsOfN {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m;  int sum=0;
		while(n!=0)
		{
			m=n%10;
			sum=sum+m;
			n=n/10;
			System.out.println(sum);
		}
		
	}
}
