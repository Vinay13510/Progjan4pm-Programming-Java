import java.util.Scanner;
public class NTo1 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number");
	int n=s.nextInt();
	while(n>0)
	{
		System.out.println(n);
		n--;
	}
}
}
