import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         int num=s.nextInt();
         int sum=0;
         for(int i=1;i<num;i++)
         {
        	if(num%i==0)
        	{
        		sum=sum+i;
        	}
         }
         if(num==sum)
         {
        	 System.out.println("Perfect number..");
         }
         else {
        	 System.out.println("Not a perfect number....");
         }
	}

}
