import java.util.Scanner;
public class UsingMethodFirstN{
   public static void main(String[] args)
   {
      Scanner s=new Scanner(System.in);
      System.out.println("enter a number:");
      int n=s.nextInt();
      static int sumNatural(int x)
       {
        int sum=0;
        for(int i=0;i<=n;i++)
        {
          sum=sum+i;
          return sum;
          }
        }
