package commandsdemo;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) 
	  {
		int arrevens=0,arrodds=0;
		int arr[]= new int[10];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
		   arr[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++)
		{
			if(arr[i]%2==0)
			 arrevens=arr[i]+arrevens;
			else
				arrodds=arr[i]+arrodds;	
		}
		System.out.println("Even sum is:"+arrevens +"Odd sum is:"+arrodds);
	 } 

}
