import java.util.Scanner;
public class AlphabetOrNot {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter one Character:");
	char ch=s.next().charAt(0);
        if(ch>=65&&ch<=90||ch>=97&&ch<=122)
{
System.out.println("Alphabet");
}
else{
System.out.println("not an Alphabet");
}
}
}