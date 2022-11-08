import java.util.Scanner;
public class VoteAge {
	
	           public static void main(String[] args) {
				Scanner s=new Scanner(System.in);
				System.out.println("enter your age:");
				int age=s.nextInt();
				if(age<18)
				{
					  
					   System.out.println("you can vote after "+(18-age)+ "years" );
				}
				else { 
				
					  System.out.println("you are voting for last "+(age-18)+"years");
				}

}
}
