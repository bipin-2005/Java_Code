/* Given an integer n, write a function to print all numbers from 1 to n (inclusive) using recursion.
You must not use any loops such as for, while, or do-while.
The function should print each number on a separate line, in increasing order from 1 to n.
Example 1
Input: n = 5
Output:
1  
2  
3  
4  
5*/

package basicRecursion_Questions;

import java.util.Scanner;
public class Q1 {
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
        count(num-1);
        System.out.println(num);
    }
}
