/*Count all Digits of a Number
You are given an integer n. You need to return the number of digits in the number.

The number will have no leading zeroes, except when the number is 0 itself.
Example 1
Input: n = 4
Output: 1

Explanation: There is only 1 digit in 4.
Example 2
Input: n = 14
Output: 2
Explanation: There are 2 digits in 14. */
package basicMaths_Question;
import java.util.Scanner;
public class countingDigits{
    public static void main(String args[]){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter your value: ");
        int data=input.nextInt();
        int count=0;
        while(data>0){
            data=data/10;
            count++;
        }
        System.out.println("Number of digits are : "+count);
        input.close();
    }  
}
