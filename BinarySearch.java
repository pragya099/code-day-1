
import java.util.Scanner;
public class BinarySearch{
    public static void main(String [] args){
        
int [] arr={12,43,45,23,45,45,67};
       
       Scanner sc= new Scanner(System.in);
        System.out.println("enter target value");
        int target = sc.nextInt();
        int result = BinarySearch(arr, target);
        System.out.println(result);
        // if(result == -1){
        //     System.out.println("element not found");
        // }
        // else{
        //     System.out.println("element found at index: " + result);
        // }
    }
    static int BinarySearch(int []arr, int target)
    {
          
        int start =0;
        int end =arr.length-1;
        
        while(start<=end){
            int mid =(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
             
        }
        return arr[start];
    }
        
    
}