package commandsdemo;
//import java.util.Scanner;
public class Reverseno {
	public static void main(String[] args) {
		int i,sum=0,remainder,n;
		n=23;
//		Scanner sc=new Scanner(System.in);
//		n=sc.nextInt();
		while(n>=0)
		{
		  remainder=n%10;
		  sum=sum*10+remainder;
		  n=n/10;
		}
		System.out.println("Reverse is:"+sum);
	}

}


// This project is craeted 4 years ago.
