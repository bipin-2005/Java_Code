/* Sum of First N Numbers
Given an integer N, return the sum of first N natural numbers. Try to solve this using recursion.

Example 1
Input : N = 4
Output : 10
Explanation : first four natural numbers are 1, 2, 3, 4.

Sum is 1 + 2 + 3 + 4 => 10.
*/

package basicRecursion_Questions;

import java.util.Scanner;
public class Q3 {
    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n1=input.nextInt();
        int result = sum(n1);
        System.out.println("Sum of first "+n1+" natural number is : "+result);
        input.close();
    }
    static int sum(int num){
        if(num==0){
            return 0;
        }
        return num+sum(num-1);

    }
}
