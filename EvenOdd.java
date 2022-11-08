import java.util.Scanner;
class EvenOdd{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter one integer value:");
int x=s.nextInt();
if(x%2==0){
System.out.println(x + "  is even");
}
else{
System.out.println(x +"  is odd");
}
}
}