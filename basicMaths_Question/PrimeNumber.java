package basicMaths_Question;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int value =input.nextInt();
        int flag=0;
        for(int i=2;i<=value/2;i++){
            if(value%i==0){
                flag=1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("Prime number :"+value);
        }
        else System.out.println("Not Prime number : "+value);
        input.close();
    }
    
}
