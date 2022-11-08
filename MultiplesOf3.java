import java.util.Scanner;

public class MultiplesOf3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n)
        {
        	if(n%3==0)
        		System.out.println(n);
        	i++;
        	
        		
        }
       
	}
}