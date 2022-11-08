import java.util.Scanner;
public class VowelOrConsonant {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter one Character:");
	char ch=s.next().charAt(0);
        if(ch>=65&&ch<=90||ch>=97&&ch<=122)
{
if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
System.out.println("Vowel....");

else
System.out.println("consonents...");
}
else{
System.out.println("it is not an Alphabet");
}
}

}
}