import java.util.Scanner;

/*
  Given an array C[], write a program that prints 1 if array is sorted in non-decreasing order, else prints 0.

Input:
The first line of input contains an integer T denoting the number of test cases. For each test case there will be two lines. First line contains the size of the array N. Second line contains N space seperated integers of the array C[i].

Output:
Print 1 if array is sorted, else print 0.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 500
1 ≤ C[i] ≤ 1200

Example:
Input
2
5
10 20 30 40 50
6
90 80 100 70 40 30

Output
1
0
 */
public class CheckIncreasingOrder {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 int test=s.nextInt();
		 while(test-->0)
		 {
		  int size=s.nextInt();
		  int arr[] = new int[size];
		  
		  for(int i=0;i<size;i++)
		  {
		      
		      arr[i] =s.nextInt();
		      
		 }
		    boolean b=false;
		   
		     for(int i=0;i<size-1;i++)
		     {
		      
		       if(arr[i]<=arr[i+1])
		     {
		        b=true;
		     }
		     else
		     {
		         b=false;
		         break;
		     }
		      
		 }
		   if(arr.length==1)
		    {
		      System.out.print("1"); 
		   }
		    else if(b)
		    {
		        System.out.print("1");  
		    }
		    else
		    {
		       System.out.print("0");    
		    }
		     
		 System.out.println();   
		 }
		 
		 

	}

}
