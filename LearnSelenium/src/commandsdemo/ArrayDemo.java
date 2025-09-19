package commandsdemo;

public class ArrayDemo {
	
	public static void main(String[] args)
	{
		int arr[]= new int[10];
		int k=0,m=0;
		int arrevens[]=new int[5];
		
		int arrodds[]=new int[5];
		for(int i=0;i<10;i++)
		{
			arr[i]=i+1;
		}
		
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]%2==0)
			{
		    arrevens[k]=arr[j]+arrevens[k];	
			++k;
			}
			else
			{
		   arrodds[m]=arr[j]+arrodds[m];	
			++m;
			}
		}
		 for(int i=0;i<5;i++)
		 {
			 System.out.println("Even sum is:"+arrevens[i]);
		 }
		 for(int i=0;i<5;i++)
		 {
			 System.out.println("odd sum is:"+arrodds[i]);
		 }
	}

}


// This project is created 4 yeras ago. Thank you!!



