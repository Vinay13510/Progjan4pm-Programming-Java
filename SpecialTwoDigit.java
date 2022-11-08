	import java.util.Scanner;
          public class SpecialTwoDigit {
           public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("enter one integer value:");
			int x=s.nextInt();
			int d1=x/10;
                        int d2=x%10;
int sum=d1+d2+d1*d2;
if(sum==x)
{
System.out.println(x+ "is special two digit number..");
}
else{
System.out.println(x+ "is not a Special number...");
}
}
}
