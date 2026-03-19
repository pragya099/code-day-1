
import java.util.*;
public class BasicArray
{
	public static void main(String args[])
	{
		int i,n;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of arr n:");
		n = sc.nextInt();
		int arr[]  = new int[n];
		System.out.print("enter "+n+"element");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
	}
}