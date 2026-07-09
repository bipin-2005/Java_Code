/*Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15

Print the pattern in the function given to you.*/
package Patterns_Question;

import java.util.Scanner;

public class Pattern13{
        public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int range = input.nextInt();
        int temp=1;
        for(int i=0;i<range;i++){
            for(int j=0;j<=i;j++){
                System.out.print(temp+" ");
                temp++;
            }
            System.out.println();
        }
        input.close();
    }
}
