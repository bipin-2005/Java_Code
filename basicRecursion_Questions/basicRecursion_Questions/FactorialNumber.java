package basicRecursion_Questions;
import java.util.Scanner;
public class FactorialNumber {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number ");
        int num=input.nextInt();
        int result = factorial(num);
        System.out.println(result);
        input.close();
    }

    static int factorial(int num){
        if(num==0){
            return 1;
        }
        return num * factorial(num-1);
    }
}
