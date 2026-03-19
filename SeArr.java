//How do you declare an integer array of fixed size and access its elements?
import java.util.*;
public class SeArr
{
	static int SumArray(int[] arr,int k){
	int maxSum=0;
	for(int i=0;i<k;i++)
	{
		maxSum+=arr[i];
		
	}
	int max= sum;
	for(int i=k;i<arr.length;i++)
	{
		int tempSum=maxSum+arr[i]-arr[i-k];
		
		
		if(tempSum>maxSum)
		{
			maxSum=tempSum;
		}
	}
		return max;
	}
	public static void main(String args[])
	{
		int arr[]={2,3,1,8,7,5,4};
		int k=3;
		System.out.print(arr,k);
	}
}
//Does the line int fifth[10] = {1}; 
//fill the entire array with the number 1? Why or why not?