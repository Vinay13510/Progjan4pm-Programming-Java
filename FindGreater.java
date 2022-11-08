import java.util.Scanner;
public class FindGreater {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		System.out.println("enter first integer:");
		int y=s.nextInt();
		System.out.println("enter second integer:");
		if(x>y) {
			System.out.println(x+"is greater than "+y+" by"+(x-y)+" numbers");
		}
		else {
			System.out.println(x+"is lesser than "+y+" by"+(y-x)+" numbers");
		}
	}
}
