import java.util.Scanner;
class Arithmatic{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter one integer value:");
int x=s.nextInt();
int y=s.nextInt();
System.out.println(x+"+"+y+"="+(x+y));
System.out.println(x+"-"+y+"="+(x-y));
System.out.println(x+"*"+y+"="+(x*y));
System.out.println(x+"/"+y+"="+(x/y));
System.out.println(x+"%"+y+"="+(x%y));
}
}