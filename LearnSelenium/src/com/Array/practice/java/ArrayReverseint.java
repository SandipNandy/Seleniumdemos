package com.Array.practice.java;
public class ArrayReverseint {
	public static void main(String[] args) {	
		int sum=0,remainder,n;
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

//Array revverse in java
