/*Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

A
AB
ABC
ABCD
ABCDE

Print the pattern in the function given to you.*/

package patterns_Question;

import java.util.Scanner;

public class Pattern14 {
        public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int range = input.nextInt();
        for(int i=0;i<range;i++){
            for(char j='A';j <= 'A'+i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        input.close();
    }
}
