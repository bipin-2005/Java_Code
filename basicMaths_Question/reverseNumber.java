/*Reverse a number
Hints
You are given an integer n. Return the integer formed by placing the digits of n in reverse order.
Example 1
Input: n = 25
Output: 52
Explanation: Reverse of 25 is 52.
Example 2
Input: n = 123
Output: 321
Explanation: Reverse of 123 is 321. */
package basicMaths_Question;
import java.util.Scanner;
public class reverseNumber {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int data = input.nextInt();
        int rev=0,rem=0;
        while(data>0){
            rem=data % 10;
            rev=(rev*10)+rem;
            data/=10;
        }
        System.out.println("Reverse Number:"+rev);
        input.close();
    }
    
}
