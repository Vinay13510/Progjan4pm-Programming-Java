import java.util.Scanner;
public class StudentResult {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter 4 Subject marks:");
	int x=s.nextInt();
	int y=s.nextInt();
	int z=s.nextInt();
        int a=s.nextInt();
        
	if(x>=35&&y>=35&&z>=35&&a>=35)
	{
		
			System.out.println("student pass");
		}
		else {
			System.out.println("student is fail");
		}
	}
	

}
