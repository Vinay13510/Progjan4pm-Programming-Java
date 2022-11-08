import java.util.Scanner;
public class EvenOddUsingSwitch {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter 3 integers:");
	int n=s.nextInt();
        SWitch(n%2){
        case 0:
               System.out.println("even number..");
                    break;
        case 1:
               System.out.println("odd number..");
                    break;

}
}
}