/*Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
*
**
***
****
*****
****
***
**
*
Print the pattern in the function given to you.*/
package patterns_Question;

import java.util.Scanner;

public class Pattern10 {
        public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int range = input.nextInt();
        for(int i=0;i<range;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=range;i>0;i--){
            for(int j=i-1;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
