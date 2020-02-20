import java.util.Scanner;

public class Leaders {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 int test=s.nextInt();
		 while(test-->0)
		 {
		     int size= s.nextInt();
		     int arr[] = new int[size];
		     for(int i=0;i<size;i++)
		     {
		        arr[i] = s.nextInt(); 
		         
		         
		         
		         
		     }
		     
		     
		     
		    leadersInArray(arr);
		    System.out.println(); 
		     
		 }
		 
		 
		 
		 
		 
		 

	}

	private static void leadersInArray(int[] arr) {
		// TODO Auto-generated method stub
		   int max=Integer.MIN_VALUE;
	        int count=0;
	     int b[] = new int[count];
	        for(int i=n-1;i>=0;i--)
	        {
	            if(arr[i]>=max)
	            {
	                max=arr[i];
	                 b[i]=max;
	               count++;
	          //    System.out.print(max+" ");
	            }
	            
	            
	            
	            
	            
	            
	        }
	         
	        for(int i=count-1;i>0;i--)
	        {
	               System.out.print(b[i]+" ");
	         }
	}

	 
	            
	            
	            
	       

}
