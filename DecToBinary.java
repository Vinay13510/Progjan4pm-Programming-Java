

import java.util.Scanner;
class DecTobinary {
	static String decToBin(int dec)
	{
		String bin=" ";
		while(dec>0)
		{
			int rem=dec%2;
			bin=rem+bin;
			dec=dec/2;
		}
		return bin;
	}

 static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value:");
		int n=s.nextInt();
		String s1=decToBin(n);
		System.out.println(s1);
	}
}
	