package basicRecursion_Questions;
/*Given an array arr of n elements. 
The task is to reverse the given array. The reversal of array should be inplace.
Example 1
Input: n=5, arr = [1,2,3,4,5]
Output: [5,4,3,2,1]
Explanation: The reverse of the array [1,2,3,4,5] is [5,4,3,2,1]
Example 2
Input: n=6, arr = [1,2,1,1,5,1]
Output: [1,5,1,1,2,1]
Explanation: The reverse of the array [1,2,1,1,5,1] is [1,5,1,1,2,1]. */

public class Q4{
    public static void main(String args[]){
        int[] arr={1,2,3,4,5};
        reverse(arr,0,4);
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(" "+arr[i]);
        }
    }
    public static void reverse(int[] arr,int left,int right){
        if(left>=right) return;
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        reverse(arr,left+1,right-1);
    }
}
