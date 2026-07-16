/* Given an integer n, write a function to print all numbers from n to 1 (inclusive) using recursion.
You must not use any loops such as for, while, or do-while.
The function should print each number on a separate line, in decreasing order from n to 1
Example 1
Input: n = 5
Output:
5
4
3
2
1
*/

package basicRecursion_Questions;

import java.util.Scanner;
public class Q2 {
    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n1=input.nextInt();
        count(n1);
        input.close();
    }
    static void count(int num){
        if(num==0){
            return;
        }
        System.out.println(num);
        count(num-1);
    }
}
