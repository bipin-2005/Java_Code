/*Given an array of integers nums, return the value of the largest element in the array
Example 1
Input: nums = [3, 3, 6, 1]
Output: 3
Explanation: The largest element in array is 6
Example 2
Input: nums = [3, 3, 0, 99, -40]
Output: 3
Explanation: The largest element in array is 99 
------------------------------------
Constraints
1 <= nums.length <= 105
-104 <= nums[i] <= 104
nums may contain duplicate elements.
------------------------------------
*/
package Arrays_Question;
public class secondlargestElement {
    public static void main(String args[]){
        int[] array = {8,8,7,6,5};
        System.out.println(solution(array));
    } 
    public static int solution(int[] nums) {
        int max=nums[0],secondlargest=0;
        for(int i=1;i<nums.length;i++){
            for(int j=2;j<nums.length;j++)
            {
            if(nums[i]<nums[j]){
                secondlargest=max;
                max=nums[i];
            }
        }
        }
        return secondlargest;
    }
}

